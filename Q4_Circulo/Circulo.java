package Q4_Circulo;

public class Circulo {
    private double raio;
    private Ponto centro;

    // Construtor que recebe o raio e um ponto (centro do círculo)
    public Circulo(double raio, Ponto centro) {
        this.raio = raio;
        this.centro = centro;
    }

    // Construtor que recebe o raio e posiciona o círculo na origem
    public Circulo(double raio) {
        this.raio = raio;
        this.centro = new Ponto(0, 0); // Centro na origem
    }

    // Método para acessar o raio
    public double getRaio() {
        return raio;
    }

    // Método para inflar (aumentar o raio)
    public void inflar(double valor) {
        if (valor > 0) {
            this.raio += valor;
        }
    }

    // Método para desinflar (diminuir o raio)
    public void desinflar(double valor) {
        if (valor > 0 && this.raio - valor > 0) {
            this.raio -= valor;
        }
    }

    // Método para calcular a área do círculo
    public double calcularArea() {
        return Math.PI * raio * raio; // A área do círculo é π * r²
    }
}
