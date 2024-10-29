package lacoscondicionais;

import java.util.Scanner;

public class SwithCase {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int opcao;
		
		System.out.println("# ## ### #### #########   Menu   ########## #### ### ## #");
        System.out.println("\n--Digite 1 para ver Indicação de um Livro--");
        System.out.println("--Digite 2 para ler uma Frase Motivacional--");
        System.out.println("--Digite 3 para receber uma Indicação de música--");
        opcao = leia.nextInt();
        
        switch (opcao) {
        
        case 1:
        	System.out.println("Livro: Memórias postúmas de brás cubas");
        	break;
        	
        case 2:
        	System.out.println("Frase motivacional: Não desista do curso da generation");
        	break;
        	
        case 3: 
        	System.out.println(" Indicação de Música: Só preciso de um dinheiro pra comprar o mé");
        	break;
        	
        default:
        System.out.println("Opção inválida. Entre com uma opção válida");
        
        }

	}

}
