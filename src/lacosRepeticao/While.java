package lacosRepeticao;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean continua;
		
		System.out.println("\n++++++++++++++++MENU++++++++++++++++++");
		System.out.print("\nDeseja usar nossa calculadora de soma? (s/n): ");
		continua = scanner.next().equalsIgnoreCase("s");//vai receber uma string que vai guardar dentro do boolean, ignorar o camel case, o qie ele precisa é do s maiúscula ou minuscula
		System.out.println("++++++++++++++++++++++++++++++++++");
		
		while(continua) 
		{
			System.out.print("Digite o primeiro valor: ");
            int numero1 = scanner.nextInt();
 
            System.out.print("Digite o segundo valor: ");
            int numero2 = scanner.nextInt();
            
            int resul = numero1 + numero2;
            System.out.println("Resultaado da soma é: " + resul);
            
            System.out.println("\n++++++++++++++++MENU++++++++++++++++++");
    		System.out.print("\nDeseja continuar a usar nossa calculadora de soma? (s/n): ");
    		continua = scanner.next().equalsIgnoreCase("s");
    		System.out.println("++++++++++++++++++++++++++++++++++");
		}
		

	}

}
