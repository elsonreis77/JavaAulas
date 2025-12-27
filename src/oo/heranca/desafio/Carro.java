package oo.heranca.desafio;

public class Carro {

    final int VELOCIDADE_MAXIMA;
    private int velocidade;
    int delta = 30;

    public Carro(int velocidadeMaxima) {
        VELOCIDADE_MAXIMA = velocidadeMaxima;
    }

    public void acelerar() {
        if(velocidade + delta > VELOCIDADE_MAXIMA){
            velocidade = VELOCIDADE_MAXIMA;
        } else {
            velocidade += delta;
        }
    }

    public void freiar() {
        if(velocidade >= delta) {
            velocidade -= delta;
        } else {
            velocidade = 0;
        }
    }
}
