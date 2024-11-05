package collection;

import java.util.HashSet;

public class SetEx {

	public static void main(String[] args) {
		// Cria a Collection Set, do tipo String chamada setFrutas
        HashSet<String> setFrutas = new HashSet<String>();
 
                // Adiciona algumas frutas na Colection Set
                setFrutas.add("Abacate");
                setFrutas.add("Banana");
                setFrutas.add("Jaboticaba");
                setFrutas.add("Kiwi");
                setFrutas.add("Maçã");
                setFrutas.add("Morango");
                setFrutas.add("Pêra");
                setFrutas.add("Jaboticaba");
                setFrutas.add("Kiwi");
                
                System.out.println(setFrutas);//não vai repetir kiwi, ela guarda aleatório na  memória
                
                System.out.println("\nExiste a fruta Kiwi? " + setFrutas.contains("kiwi"));
                
             // Verifica se a Collection Set está vazia
                System.out.println("\nA Colection Set está vazia? " + setFrutas.isEmpty());
                
                setFrutas.clear();
                
                System.out.println("\nA Colection Set está vazia? " + setFrutas.isEmpty());
	}

}
