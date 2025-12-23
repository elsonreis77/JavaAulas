package oo.heranca;

public class Jogo {
    public static void main(String[] args) {

        Jogador jogador1 = new Jogador();
        jogador1.andar(Direcao.LESTE);
        jogador1.andar(Direcao.NORTE);
        System.out.println(jogador1.n);
        System.out.println(jogador1.l);

        System.out.println();
    }
}
