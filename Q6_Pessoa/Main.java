package Q6_Pessoa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criando a primeira pessoa
        System.out.print("Digite o nome da primeira pessoa: ");
        String nome1 = scanner.nextLine();
        Pessoa pessoa1 = new Pessoa(nome1);

        // Criando a segunda pessoa
        System.out.print("Digite o nome da segunda pessoa: ");
        String nome2 = scanner.nextLine();
        Pessoa pessoa2 = new Pessoa(nome2);

        // Definindo pais e mães para as pessoas (opcional)
        System.out.print("Digite o nome do pai da primeira pessoa (ou deixe em branco): ");
        String nomePai1 = scanner.nextLine();
        if (!nomePai1.isEmpty()) {
            pessoa1 = new Pessoa(nome1, new Pessoa(nomePai1), pessoa1.getMae());
        }

        System.out.print("Digite o nome da mãe da primeira pessoa (ou deixe em branco): ");
        String nomeMae1 = scanner.nextLine();
        if (!nomeMae1.isEmpty()) {
            pessoa1 = new Pessoa(nome1, pessoa1.getPai(), new Pessoa(nomeMae1));
        }

        System.out.print("Digite o nome do pai da segunda pessoa (ou deixe em branco): ");
        String nomePai2 = scanner.nextLine();
        if (!nomePai2.isEmpty()) {
            pessoa2 = new Pessoa(nome2, new Pessoa(nomePai2), pessoa2.getMae());
        }

        System.out.print("Digite o nome da mãe da segunda pessoa (ou deixe em branco): ");
        String nomeMae2 = scanner.nextLine();
        if (!nomeMae2.isEmpty()) {
            pessoa2 = new Pessoa(nome2, pessoa2.getPai(), new Pessoa(nomeMae2));
        }

        // Verificando se as duas pessoas são iguais
        if (pessoa1.ehIgual(pessoa2)) {
            System.out.println("As duas pessoas são iguais.");
        } else {
            System.out.println("As duas pessoas são diferentes.");
        }

        scanner.close();
    }
}
