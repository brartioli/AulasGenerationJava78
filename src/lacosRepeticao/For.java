package lacosRepeticao;

import java.util.Scanner;

public class For {

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		int numero, resul;
		System.out.println("Escolha uma tabuada: ");
		numero = scanner.nextInt();
		
		for(int i=1; i<=10; i++) {
			resul= numero * i;
			System.out.println(numero + "X" + i + " = " + resul);
		}
		
		
		
		
		

	}

}
