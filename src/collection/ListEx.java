package collection;

import java.util.ArrayList;
import java.util.Scanner;

public class ListEx {

	public static void main(String[] args) {
		
		//Criar collection ArrayList, do tipo Double, Chamada notas
		
		ArrayList<Double> notas = new ArrayList<Double>();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota: ");
		notas.add(scanner.nextDouble());//metodo de adicionar coisas dentro da nossa lista notas
		
		notas.add(7.0);
		notas.add(5.0);
        notas.add(4.0);
        notas.add(10.0);
        notas.add(4.0);
        
        System.out.println("\nNotas cadastradas - Laço For...Each");
        
        for(Double nota : notas) {
        	if(nota % 2 == 0) {
        		System.out.println(nota);
        	}
        	//if: para imprimir as notas que forem pares ou impar(notas%2 != 0)
        	//determinado por dois pontos :
        	//guarda na variável toda vez que passar na lista
        }
        
        notas.add(10.5);
        System.out.println(notas);
        
        System.out.println("Qual nota você quer conferir? ");
        System.out.println("\nNota 4.0 está na lista? " + notas.contains(scanner.nextDouble()));
              
        System.out.println("\nA nota 5 existe na lista? " + notas);
        
        System.out.println("\nA posição da nota 5 é " + notas.indexOf(1.0));//acha a nota 5.0 na lista
        
        scanner.close();
	}

}
