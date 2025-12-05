package arraysEcolecoes;

import java.util.HashMap;
import java.util.Map;

public class Mapa {
    public static void main(String[] args) {

        Map<Integer, String> usuarios = new HashMap<>();

        usuarios.put(1,"Elson");
        usuarios.put(2, "Samara");
        usuarios.put(3, "Reis");
        usuarios.put(4, "karla");

        System.out.println(usuarios.size());
        System.out.println(usuarios.isEmpty());

        System.out.println(usuarios.keySet());
        System.out.println(usuarios.values());
        System.out.println(usuarios.entrySet());

        System.out.println(usuarios.containsKey(1));
        System.out.println(usuarios.containsValue("Elson"));

        System.out.println(usuarios.get(4));
        System.out.println(usuarios.remove(2)); // Para remover a partir da chave
        System.out.println(usuarios.remove(2, "kaka")); // não foi removido, pois a string foi passada diferente

        for (int chave: usuarios.keySet()){
            System.out.println(chave);
        }

        for (String valor: usuarios.values()) {
            System.out.println(valor);
        }

        for (Map.Entry<Integer, String> Usuario: usuarios.entrySet()){
            System.out.println(Usuario.getKey() + " - " + Usuario.getValue());
        }
    }
}
