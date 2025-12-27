package oo.heranca.desafio;

public class Palio extends Carro {

    Palio(int velocidadeMaxima) {
        super(velocidadeMaxima);
    }

    Palio() {
        this(400);
    }

    @Override
    public void acelerar() {
        super.acelerar();
    }

    @Override
    public void freiar() {
        super.freiar();
    }
}
