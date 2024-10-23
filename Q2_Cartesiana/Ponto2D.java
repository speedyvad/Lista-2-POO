package Q2_Cartesiana;

public class Ponto2D {
	double Abs;//X 
	double Ord;//Y
	
	public Ponto2D() { //CONSTRUTOR DEFAULT
		this.Abs = 0;
		this.Ord = 0;
	}
	
	public Ponto2D(double Abs, double Ord) { //CONSTRUTOR COM PARAMETROS
		this.Abs = Abs;
		this.Ord = Ord;
	}
	
	public Ponto2D(Ponto2D ponto) {//CONSTRUTOR DE COPIA
		this.Abs = ponto.Abs;
		this.Ord = ponto.Ord;
	}

	public double getAbs() {
		return Abs;
	}

	public void setAbs(double abs) {
		this.Abs = abs;
	}

	public double getOrd() {
		return Ord;
	}

	public void setOrd(double ord) {
		this.Ord = ord;
	}
	
	 // Método equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Ponto2D ponto = (Ponto2D) obj;
        return this.Abs == ponto.Abs && this.Ord == ponto.Ord;
    }
    public double distancia(Ponto2D outroPonto) {
        return Math.sqrt(Math.pow(outroPonto.Abs - this.Abs, 2) + Math.pow(outroPonto.Ord - this.Ord, 2));
    }

}



