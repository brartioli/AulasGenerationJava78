package metodos;

public class Exemplo02 {

	public static void main(String[] args) {
		mensagem();
		
		somarNumeros(5,6);
	}
	
	public static void mensagem() {
		//método que não tem retorno
		//só vai fazer e e xecutar uma tarefa
		System.out.println("Método sem retorno (void)! ");
	}
	
	public static void somarNumeros(int a, int b) {
		//void método específico para não ter retorno
		int resultado = a + b;
		System.out.println("A soma é: " + resultado);
	}

}
