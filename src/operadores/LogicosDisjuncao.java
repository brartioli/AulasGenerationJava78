package operadores;

import java.util.Scanner;

public class LogicosDisjuncao {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		 
        boolean idade, maePresente, resposta;
 
        System.out.println("Vamos verificar acesso ao cinema: ");
        System.out.println("Idade maior ou igual a 18? ");
        idade = ler.nextBoolean();
 
        System.out.println("Sua mãe esta presente? ");
        maePresente = ler.nextBoolean();
        
        resposta = idade || maePresente ;
        
        System.out.println("Acesso! " + resposta);
        
        ler.close();

	}

}
