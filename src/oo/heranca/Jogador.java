package oo.heranca;

public class Jogador {
    public int s;
    public int n;
    int l;
    int o;
    public int vida = 100;

    protected Jogador(int s, int n) {
        this.s = s;
        this.n = n;
    }

  //  boolean andar(Direcao direcao) {
      //  if(direcao == Direcao.NORTE) {
       //     n++;
       // } else if(direcao == Direcao.SUL) {
         //   s++;
       // } else if(direcao == Direcao.LESTE) {
          //  l++;
        //} else if(direcao == Direcao.OESTE) {
         //   o++;
        //}

       // return true;
   // }

    public boolean atacar(Jogador oponente) {

        int deltaS = Math.abs(s - oponente.s);
        int deltaN = Math.abs(n - oponente.n);

        if(deltaS == 0 && deltaN == 1) {
            oponente.vida -= 10;
            return true;
        } else if (deltaS == 1 && deltaN == 0) {
            oponente.vida -= 10;
            return true;
        } else {
            return false;
        }
    }

    public boolean andar(Direcao direcao) {
        switch (direcao) {
            case SUL:
                s++;
                break;

            case NORTE:
                n--;
                break;

            case LESTE:
                l++;
                break;

            case OESTE:
                o--;
                break;
        }

        return true;
    }

}
