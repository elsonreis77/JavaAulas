package oo.polimorfismo;

public class Pessoa {

    double peso;
    private Pessoa pessoa;

    Pessoa(double peso) {
        setPeso(peso);
    }

    void comer(Arroz arroz) {
        this.peso += arroz.getPeso();
    }

    void comer(Feijao feijao) {
        this.peso += feijao.getPeso();
    }

    void comer(Sorvete sorvete) {
        this.peso += sorvete.getPeso();
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if(peso >= 0) {
            this.peso = peso;
        }
    }
}
