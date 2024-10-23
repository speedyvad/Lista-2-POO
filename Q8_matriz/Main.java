package Q8_matriz;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Matriz matriz1 = null;
        Matriz matriz2 = null;
        Matriz resultado = null;

        boolean continuar = true;

        // Loop para manter o programa rodando até o usuário escolher sair
        while (continuar) {
            try {
                System.out.println("\nEscolha uma opção:");
                System.out.println("1 - Criar Matriz");
                System.out.println("2 - Exibir Matrizes");
                System.out.println("3 - Somar Matrizes");
                System.out.println("4 - Subtrair Matrizes");
                System.out.println("5 - Multiplicar Matrizes (elemento por elemento)");
                System.out.println("6 - Verificar se é identidade");
                System.out.println("7 - Gerar Matriz Transposta");
                System.out.println("8 - Gerar Matriz Oposta");
                System.out.println("9 - Sair");

                int opcao = scanner.nextInt();

                switch (opcao) {
                    case 1: // Criar Matrizes
                        System.out.println("Digite o número de linhas e colunas para a Matriz 1:");
                        int linhas1 = scanner.nextInt();
                        int colunas1 = scanner.nextInt();
                        matriz1 = new Matriz(linhas1, colunas1);
                        System.out.println("Digite os elementos da Matriz 1:");
                        preencherMatriz(scanner, matriz1);

                        System.out.println("Digite o número de linhas e colunas para a Matriz 2:");
                        int linhas2 = scanner.nextInt();
                        int colunas2 = scanner.nextInt();
                        matriz2 = new Matriz(linhas2, colunas2);
                        System.out.println("Digite os elementos da Matriz 2:");
                        preencherMatriz(scanner, matriz2);
                        break;

                    case 2: // Exibir Matrizes
                        System.out.println("Matriz 1:");
                        if (matriz1 != null) {
                            matriz1.exibirMatriz();
                        } else {
                            System.out.println("Matriz 1 não foi criada.");
                        }

                        System.out.println("Matriz 2:");
                        if (matriz2 != null) {
                            matriz2.exibirMatriz();
                        } else {
                            System.out.println("Matriz 2 não foi criada.");
                        }
                        break;

                    case 3: // Somar Matrizes
                        verificarMatrizesCriadas(matriz1, matriz2);
                        resultado = matriz1.adicionar(matriz2);
                        System.out.println("Resultado da soma das matrizes:");
                        resultado.exibirMatriz();
                        break;

                    case 4: // Subtrair Matrizes
                        verificarMatrizesCriadas(matriz1, matriz2);
                        resultado = matriz1.subtrair(matriz2);
                        System.out.println("Resultado da subtração das matrizes:");
                        resultado.exibirMatriz();
                        break;

                    case 5: // Multiplicar Matrizes (elemento por elemento)
                        verificarMatrizesCriadas(matriz1, matriz2);
                        resultado = matriz1.multiplicarElementoPorElemento(matriz2);
                        System.out.println("Resultado da multiplicação elemento por elemento:");
                        resultado.exibirMatriz();
                        break;

                    case 6: // Verificar se é identidade
                        if (matriz1 != null) {
                            if (matriz1.ehIdentidade()) {
                                System.out.println("Matriz 1 é identidade.");
                            } else {
                                System.out.println("Matriz 1 não é identidade.");
                            }
                        } else {
                            System.out.println("Matriz 1 não foi criada.");
                        }
                        break;

                    case 7: // Gerar Matriz Transposta
                        verificarMatrizesCriadas(matriz1, null);
                        resultado = matriz1.gerarTransposta();
                        System.out.println("Transposta da Matriz 1:");
                        resultado.exibirMatriz();
                        break;

                    case 8: // Gerar Matriz Oposta
                        verificarMatrizesCriadas(matriz1, null);
                        resultado = matriz1.gerarOposta();
                        System.out.println("Oposta da Matriz 1:");
                        resultado.exibirMatriz();
                        break;

                    case 9: // Sair
                        continuar = false;
                        System.out.println("Encerrando o programa.");
                        break;

                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Erro: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Ocorreu um erro. Por favor, tente novamente.");
            }
        }

        scanner.close();
    }

    // Função para preencher a matriz com os valores fornecidos pelo usuário
    private static void preencherMatriz(Scanner scanner, Matriz matriz) {
        for (int i = 0; i < matriz.getLinhas(); i++) {
            for (int j = 0; j < matriz.getColunas(); j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz.setElemento(i, j, scanner.nextInt());
            }
        }
    }

    // Função auxiliar para verificar se as matrizes foram criadas
    private static void verificarMatrizesCriadas(Matriz matriz1, Matriz matriz2) {
        if (matriz1 == null) {
            throw new IllegalArgumentException("Matriz 1 não foi criada.");
        }
        if (matriz2 == null && matriz2 != null) {
            throw new IllegalArgumentException("Matriz 2 não foi criada.");
        }
    }
}
