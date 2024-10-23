package Q3_retas;

public class Main {
    public static void main(String[] args) {
        // Criando dois pontos P1 (x1, y1) e P2 (x2, y2)
        Ponto2d p1 = new Ponto2d(1, 2); // Ponto (1, 2)
        Ponto2d p2 = new Ponto2d(4, 6); // Ponto (4, 6)

        // Criando uma reta com dois pontos P1 e P2
        Reta reta1 = new Reta(p1, p2);

        // Exibindo os coeficientes da reta com 3 casas decimais
        System.out.printf("Coeficiente angular da reta 1 (a): %.3f%n", reta1.getA());
        System.out.printf("Coeficiente linear da reta 1 (b): %.3f%n", reta1.getB());

        // Criando um ponto P3 e verificando se pertence à reta 1
        Ponto2d p3 = new Ponto2d(2, 3); // Ponto (2, 3)
        if (reta1.pertenceAReta(p3)) {
            System.out.println("O ponto P3 pertence à reta 1.");
        } else {
            System.out.println("O ponto P3 não pertence à reta 1.");
        }

        // Criando outra reta com coeficiente angular e linear
        Reta reta2 = new Reta(2, 1); // Reta: y = 2x + 1

        // Encontrando o ponto de interseção entre reta1 e reta2
        Ponto2d intersecao = reta1.intersecao(reta2);

        if (intersecao != null) {
            System.out.printf("As retas se interceptam no ponto: (%.3f, %.3f)%n", intersecao.getAbs(), intersecao.getOrd());
        } else {
            System.out.println("As retas são paralelas e não se interceptam.");
        }
    }
}
