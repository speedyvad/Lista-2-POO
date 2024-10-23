package Q4_Circulo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criar um círculo com um centro específico
        System.out.print("Digite o raio do círculo: ");
        double raio = Double.parseDouble(scanner.nextLine());
        System.out.print("Digite a coordenada x do centro: ");
        double x = Double.parseDouble(scanner.nextLine());
        System.out.print("Digite a coordenada y do centro: ");
        double y = Double.parseDouble(scanner.nextLine());
        Ponto centro = new Ponto(x, y);
        Circulo circulo = new Circulo(raio, centro);

        boolean continuar = true;

        while (continuar) {
            System.out.println("\n=== MENU CÍRCULO ===");
            System.out.println("1. Exibir raio do círculo");
            System.out.println("2. Inflar o círculo");
            System.out.println("3. Desinflar o círculo");
            System.out.println("4. Calcular área do círculo");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = Integer.parseInt(scanner.nextLine());

            switch (opcao) {
                case 1:
                    System.out.println("Raio do círculo: " + circulo.getRaio());
                    break;

                case 2:
                    System.out.print("Digite o valor para inflar: ");
                    double valorInflar = Double.parseDouble(scanner.nextLine());
                    circulo.inflar(valorInflar);
                    System.out.println("Círculo inflado. Novo raio: " + circulo.getRaio());
                    break;

                case 3:
                    System.out.print("Digite o valor para desinflar: ");
                    double valorDesinflar = Double.parseDouble(scanner.nextLine());
                    circulo.desinflar(valorDesinflar);
                    System.out.println("Círculo desinflado. Novo raio: " + circulo.getRaio());
                    break;

                case 4:
                    System.out.println("Área do círculo: " + circulo.calcularArea());
                    break;

                case 5:
                    continuar = false;
                    System.out.println("Encerrando o programa.");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }

        scanner.close();
    }
}
