package Q8_matriz;

import java.util.Arrays;

public class Matriz {
    private int linhas;
    private int colunas;
    private int[][] elementos;

    // Construtor para inicializar a matriz com as dimensões fornecidas
    public Matriz(int linhas, int colunas) {
        this.linhas = linhas;
        this.colunas = colunas;
        this.elementos = new int[linhas][colunas];
    }

    // Método para definir o valor de um elemento da matriz
    public void setElemento(int linha, int coluna, int valor) {
        this.elementos[linha][coluna] = valor;
    }

    // Método para acessar o valor de um elemento da matriz
    public int getElemento(int linha, int coluna) {
        return this.elementos[linha][coluna];
    }

    // Método para adicionar duas matrizes
    public Matriz adicionar(Matriz outra) {
        if (this.linhas != outra.linhas || this.colunas != outra.colunas) {
            throw new IllegalArgumentException("As matrizes devem ter as mesmas dimensões.");
        }

        Matriz resultado = new Matriz(this.linhas, this.colunas);
        for (int i = 0; i < this.linhas; i++) {
            for (int j = 0; j < this.colunas; j++) {
                resultado.setElemento(i, j, this.elementos[i][j] + outra.elementos[i][j]);
            }
        }
        return resultado;
    }

    // Método para subtrair duas matrizes
    public Matriz subtrair(Matriz outra) {
        if (this.linhas != outra.linhas || this.colunas != outra.colunas) {
            throw new IllegalArgumentException("As matrizes devem ter as mesmas dimensões.");
        }

        Matriz resultado = new Matriz(this.linhas, this.colunas);
        for (int i = 0; i < this.linhas; i++) {
            for (int j = 0; j < this.colunas; j++) {
                resultado.setElemento(i, j, this.elementos[i][j] - outra.elementos[i][j]);
            }
        }
        return resultado;
    }

    // Método para multiplicar duas matrizes elemento por elemento
    public Matriz multiplicarElementoPorElemento(Matriz outra) {
        if (this.linhas != outra.linhas || this.colunas != outra.colunas) {
            throw new IllegalArgumentException("As matrizes devem ter as mesmas dimensões para a multiplicação elemento por elemento.");
        }

        Matriz resultado = new Matriz(this.linhas, this.colunas);
        for (int i = 0; i < this.linhas; i++) {
            for (int j = 0; j < this.colunas; j++) {
                // Multiplica os elementos correspondentes das duas matrizes
                resultado.setElemento(i, j, this.elementos[i][j] * outra.elementos[i][j]);
            }
        }
        return resultado;
    }

    // Método para retornar a transposta da matriz
    public Matriz gerarTransposta() {
        Matriz transposta = new Matriz(this.colunas, this.linhas);
        for (int i = 0; i < this.linhas; i++) {
            for (int j = 0; j < this.colunas; j++) {
                transposta.setElemento(j, i, this.elementos[i][j]);
            }
        }
        return transposta;
    }

    // Método para retornar a oposta da matriz
    public Matriz gerarOposta() {
        Matriz oposta = new Matriz(this.linhas, this.colunas);
        for (int i = 0; i < this.linhas; i++) {
            for (int j = 0; j < this.colunas; j++) {
                oposta.setElemento(i, j, -this.elementos[i][j]);
            }
        }
        return oposta;
    }

    // Método para verificar se a matriz é identidade
    public boolean ehIdentidade() {
        if (this.linhas != this.colunas) {
            return false;
        }
        for (int i = 0; i < this.linhas; i++) {
            for (int j = 0; j < this.colunas; j++) {
                if (i == j && this.elementos[i][j] != 1) {
                    return false;
                }
                if (i != j && this.elementos[i][j] != 0) {
                    return false;
                }
            }
        }
        return true;
    }

    // Método para obter o número de linhas
    public int getLinhas() {
        return this.linhas;
    }

    // Método para obter o número de colunas
    public int getColunas() {
        return this.colunas;
    }

    // Método para exibir a matriz
    public void exibirMatriz() {
        for (int[] linha : this.elementos) {
            System.out.println(Arrays.toString(linha));
        }
    }

    // Comparação semântica da matriz
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Matriz outra = (Matriz) obj;
        return Arrays.deepEquals(this.elementos, outra.elementos);
    }
}