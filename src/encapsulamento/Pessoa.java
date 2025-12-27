package encapsulamento;

public class Pessoa {

    private String nome;
    private int idade;
    private double peso;

    public Pessoa(String nome, int idade, double peso) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
    }

    void setNome(String nome) {
        this.nome = nome;
    }

    String getNome() {
        return nome;
    }

    void setIdade(int idade) {
        this.idade = idade;
    }

    int getIdade() {
        return idade;
    }

    void setPeso(double peso) {
        this.peso = peso;
    }

    double getPeso() {
        return peso;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", peso=" + peso +
                '}';
    }
}
