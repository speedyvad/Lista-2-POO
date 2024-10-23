package Q2_Cartesiana;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Ponto2D ponto1 = new Ponto2D(); // Criando o primeiro ponto
        Ponto2D ponto2 = new Ponto2D(); // Criando o segundo ponto
        int opcao;

        do {
            System.out.println("Menu:");
            System.out.println("1. Definir valores do ponto 1");
            System.out.println("2. Definir valores do ponto 2");
            System.out.println("3. Calcular distância entre ponto 1 e ponto 2");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o valor de x (Abs) para o ponto 1: ");
                    ponto1.setAbs(scanner.nextDouble());
                    System.out.print("Digite o valor de y (Ord) para o ponto 1: ");
                    ponto1.setOrd(scanner.nextDouble());
                    System.out.println("Ponto 1 definido como (" + ponto1.getAbs() + ", " + ponto1.getOrd() + ")");
                    break;

                case 2:
                    System.out.print("Digite o valor de x (Abs) para o ponto 2: ");
                    ponto2.setAbs(scanner.nextDouble());
                    System.out.print("Digite o valor de y (Ord) para o ponto 2: ");
                    ponto2.setOrd(scanner.nextDouble());
                    System.out.println("Ponto 2 definido como (" + ponto2.getAbs() + ", " + ponto2.getOrd() + ")");
                    break;

                case 3:
                    double distancia = ponto1.distancia(ponto2);
                    System.out.println("A distância entre os dois pontos é: " + distancia);
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);

        scanner.close();
    }
}

