package collection2;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<String>();
		
		Collections.addAll(fila, "Gabriel","Priscila","Kaue");
		
		System.out.println(fila);
		
		System.out.println("\nAdicionar novo elemento: " + fila.add("Geandro"));
		
		System.out.println(fila);
		
		System.out.println("\nExibir o Primeiro Elemento da fila: " + fila.peek());
		
		System.out.println(fila);
		
		System.out.println("\nRemover Elemento: " +fila.remove());
		
		System.out.println(fila);
		
	}

}
