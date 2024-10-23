package Q6_Pessoa;

public class Pessoa {
    private String nome;
    private Pessoa pai;
    private Pessoa mae;

    // Construtor que inicializa o nome da pessoa e seus antecessores (pai e mãe)
    public Pessoa(String nome, Pessoa pai, Pessoa mae) {
        this.nome = nome;
        this.pai = pai;
        this.mae = mae;
    }

    // Construtor que inicializa o nome da pessoa e coloca seus antecessores como null
    public Pessoa(String nome) {
        this.nome = nome;
        this.pai = null;
        this.mae = null;
    }

    // Método para verificar a igualdade semântica entre duas pessoas
    public boolean ehIgual(Pessoa outra) {
        if (outra == null) return false; // Verifica se a outra pessoa é nula
        return this.nome.equals(outra.nome) && (this.mae == null ? outra.mae == null : this.mae.ehIgual(outra.mae));
    }

    // Métodos de acesso
    public String getNome() {
        return nome;
    }

    public Pessoa getPai() {
        return pai;
    }

    public Pessoa getMae() {
        return mae;
    }
}
