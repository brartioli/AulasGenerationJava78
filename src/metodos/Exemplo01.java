package metodos;

public class Exemplo01 {

	public static void main(String[] args) {
		int resul;
		
		resul = somar(4,6);//enviando atráves do paramêtro para o método somar
							//vai guardar no return
		
	}
	
	public static int somar(int numero1, int numero2) {
		return numero1 + numero2;//método que tem de retorno a soma de dois números
								//no return cria a lógica esperada
	}

}
