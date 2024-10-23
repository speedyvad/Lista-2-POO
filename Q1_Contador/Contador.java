package Q1_Contador;

public class Contador {
    private int valor;

    // Construtor que inicializa o contador com valor zero
    public Contador() {
        this.valor = 0;
    }

    // Método para definir o valor inicial do contador
    public void setValor(int valor) {
        this.valor = valor;
    }

    // Método para zerar o contador
    public void zerar() {
        this.valor = 0;
    }

    // Método para incrementar o valor do contador
    public void incrementar() {
        this.valor++;
    }

    // Método para retornar o valor atual do contador
    public int getValor() {
        return this.valor;
    }
}
