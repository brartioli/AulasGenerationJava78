package metodos;

import java.util.Scanner;

public class Exemplo03 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite sua idade: ");
		String classificacao = classificarIdade(scanner.nextInt());
		System.out.println(classificacao);

	}

	public static String classificarIdade(int idade) {
		if(idade < 0 || idade > 120) {
			return "Idade inválida";
		}else if(idade < 13) {
			return "Criança";
		}else if(idade < 18) {
			return "Adoslecente";
		}else if(idade < 65) {
			return "Adulto";
		}else {
			return"Idoso";
		}
		

	}

}
