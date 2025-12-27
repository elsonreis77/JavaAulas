package oo.heranca.teste;

import oo.heranca.desafio.Carro;

public class CarroTeste {
    public static void main(String[] args) {
        Carro carro1 = new Carro(20);
        carro1.acelerar();
        carro1.acelerar();
        carro1.freiar();
        carro1.freiar();
        carro1.freiar();
    }
}
