package vetor;

import java.util.Arrays;
import java.util.Scanner;

public class VetorEx2 {

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int vetorInteiros[] = new int[5];

		for (int i = 0; i < vetorInteiros.length; i++) {
			System.out.printf("digite o " + (i + 1) + "° numero: ");
			vetorInteiros[i] = scanner.nextInt();
		}
		for (int i = 0; i < vetorInteiros.length; i++) {
			System.out.println((i + 1) + "° elemento: " + vetorInteiros[i]);
		}
		System.out.println("Tamanho do vetor:" + vetorInteiros.length);
		Arrays.sort(vetorInteiros);
		for (int i = 0; i < vetorInteiros.length; i++) {
			System.out.println((i + 1) + "º elelemnto: " + vetorInteiros[i]);
		}

	}

}
