package oo.heranca;

public class Heroi extends Jogador {

    //boolean atacar(Jogador oponente) {
     //   int deltaS = Math.abs(s - oponente.s);
      //  int deltaN = Math.abs(n - oponente.n);

       // if(deltaS == 0 && deltaN == 1) {
       //     oponente.vida -= 15;
       //     return true;
     //   } else if (deltaS == 1 && deltaN == 0) {
       //     oponente.vida -= 15;
      //      return true;
      //  } else {
     //      return false;
    //    }
   // }

    boolean atacar(Jogador oponente) {
        boolean ataque1 = super.atacar(oponente);
        boolean ataque2 = super.atacar(oponente);
        return ataque1 || ataque2;
    }

}
