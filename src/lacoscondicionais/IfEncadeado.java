package lacoscondicionais;

import java.util.Scanner;

public class IfEncadeado {

	public static void main(String[] args) {
Scanner escrever = new Scanner(System.in);
		
		float nota1, nota2, media;
		
		System.out.println("Digite a nota 1:");
		nota1 = escrever.nextFloat();
		System.out.println("Digite a nota 2:");
		nota2 = escrever.nextFloat();
		
		media = (nota1 + nota2)/2;
		
		if (media >= 6) {
			System.out.println("Parabéns você foi aprovado, com a media de: " +media);
		}
		else if(media >= 5) {
			System.out.println("Sua media é: " +media + " você ficou de recuperação");
		}
		else {
			System.out.println("Reprovado, estude mais, sua média foi de:" +media);
		}
		
		escrever.close();
	}

}
