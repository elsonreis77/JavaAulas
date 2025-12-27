package oo.heranca.teste;

import oo.heranca.Heroi;
import oo.heranca.Monstro;

public class Jogo {
    public static void main(String[] args) {

        Monstro jogador1 = new Monstro();
        jogador1.n = 10;
        jogador1.s = 10;

        Heroi jogador2 = new Heroi(2,4);
        jogador2.n = 10;
        jogador2.s = 11;

        System.out.println("Vida heroi => " + jogador1.vida);
        System.out.println("Vida mosntro => "+jogador2.vida);

        jogador1.atacar(jogador2);
        jogador2.atacar(jogador1);
        System.out.println();

        System.out.println("Vida monstro => " + jogador1.vida);
        System.out.println("Vida heroi => "+jogador2.vida);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
    }
}
