package oo.polimorfismo;

public class Jantar {
    public static void main(String[] args) {

        Pessoa cliente = new Pessoa(90.0);

        Arroz a1 = new Arroz(0.200);
        Feijao f1 = new Feijao(0.100);
        Sorvete s1 = new Sorvete(0.300);

        System.out.println(cliente.peso);

        cliente.comer(a1);
        cliente.comer(f1);
        cliente.comer(s1);
    }
}
