package metodos;

public class Teste {

	public static void main(String[] args) {

		int resul;

		Exemplo01.somar(0, 0);// linkando por conta do static!
		
		Exemplo02.mensagem();
		
		resul = Exemplo01.somar(5, 4);
		
		System.out.println(resul);

	}

}
