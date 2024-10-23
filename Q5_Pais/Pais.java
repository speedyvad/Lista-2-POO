package Q5_Pais;

import java.util.ArrayList;
import java.util.List;

public class Pais {
    private String CodigoISO; 
    private String Nome; 
    private long Populacao; 
    private double Dimensao; 
    private List<Pais> Fronteiras; 

    
    public Pais(String CodigoISO, String Nome, double Dimensao) {
        this.CodigoISO = CodigoISO;
        this.Nome = Nome;
        this.Dimensao = Dimensao;
        this.Fronteiras = new ArrayList<>();
        this.Populacao = 0; 
    }

    public String getCodigoISO() {
        return CodigoISO;
    }

    public void setCodigoISO(String CodigoISO) {
        this.CodigoISO = CodigoISO;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public long getPopulacao() {
        return Populacao;
    }

    public void setPopulacao(long Populacao) {
        this.Populacao = Populacao;
    }

    public double getDimensao() {
        return Dimensao;
    }

    public void setDimensao(double Dimensao) {
        this.Dimensao = Dimensao;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
        	return true; 
        }
        if (obj == null || getClass() != obj.getClass()) {
        	return false; 
        }
        Pais pais = (Pais) obj; 
        return CodigoISO.equals(pais.CodigoISO); 
    }

    public double DensidadePopulacional() {
        if (Dimensao == 0) {
        	return 0; 
        }
        return Populacao / Dimensao;
    }

    public void AdicionarFronteira(Pais pais) {
        if (!Fronteiras.contains(pais)) {
            Fronteiras.add(pais);
        }
    }

    public List<Pais> getFronteiras() {
        return Fronteiras;
    }

    @Override
    public String toString() {
        return "País: " + Nome + " (Código ISO: " + CodigoISO + ")";
    }
}
