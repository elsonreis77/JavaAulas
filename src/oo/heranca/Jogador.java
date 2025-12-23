package oo.heranca;

public class Jogador {
    int s;
    int n;
    int l;
    int o;

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

    boolean andar(Direcao direcao) {
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
