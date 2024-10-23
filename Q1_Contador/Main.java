package Q1_Contador;

import java.util.Scanner; // Certifique-se de importar a classe Scanner

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Contador contador = new Contador();
        boolean continuar = true;

        while (continuar) {
            try {
                System.out.println("\n=== MENU CONTADOR ===");
                System.out.println("1. Definir valor inicial");
                System.out.println("2. Incrementar contador");
                System.out.println("3. Zerar contador");
                System.out.println("4. Exibir valor atual");
                System.out.println("5. Sair");
                System.out.print("Escolha uma opção: ");

                int opcao = Integer.parseInt(scanner.nextLine());

                switch (opcao) {
                    case 1:
                        System.out.print("Digite o valor inicial do contador: ");
                        int valorInicial = Integer.parseInt(scanner.nextLine());
                        contador.setValor(valorInicial);
                        System.out.println("Valor inicial definido como: " + contador.getValor());
                        break;

                    case 2:
                        contador.incrementar();
                        System.out.println("Valor incrementado. Valor atual: " + contador.getValor());
                        break;

                    case 3:
                        contador.zerar();
                        System.out.println("Contador zerado. Valor atual: " + contador.getValor());
                        break;

                    case 4:
                        System.out.println("Valor atual do contador: " + contador.getValor());
                        break;

                    case 5:
                        continuar = false;
                        System.out.println("Encerrando o programa.");
                        break;

                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, insira um número.");
            }
        }

        scanner.close();
    }
}
