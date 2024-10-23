package Q3_retas;

public class Reta {
    private double a; // Coeficiente angular
    private double b; // Coeficiente linear

    // Construtor com coeficientes angular e linear
    public Reta(double a, double b) {
        this.a = a;
        this.b = b;
    }

    // Construtor com dois pontos (P1 e P2)
    public Reta(Ponto2d p1, Ponto2d p2) {
        // Calculando o coeficiente angular (a)
        this.a = (p2.getOrd() - p1.getOrd()) / (p2.getAbs() - p1.getAbs());
        // Calculando o coeficiente linear (b): b = y - ax
        this.b = p1.getOrd() - this.a * p1.getAbs();
    }
 
    // Métodos de acesso (getters e setters)
    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    // Método que verifica se um ponto pertence à reta
    public boolean pertenceAReta(Ponto2d ponto) {
        // Verifica se o ponto satisfaz a equação da reta: y = ax + b
        return ponto.getOrd() == this.a * ponto.getAbs() + this.b;
    }

    // Método que calcula o ponto de interseção com outra reta
    public Ponto2d intersecao(Reta outraReta) {
        // Se as retas são paralelas (mesmo coeficiente angular)
        if (this.a == outraReta.getA()) {
            return null; // Não há interseção
        }

        // Calculando o ponto de interseção:
        // x = (b2 - b1) / (a1 - a2)
        double xIntersecao = (outraReta.getB() - this.b) / (this.a - outraReta.getA());
        // y = ax + b
        double yIntersecao = this.a * xIntersecao + this.b;

        // Retornando o ponto de interseção
        return new Ponto2d(xIntersecao, yIntersecao);
    }
}
