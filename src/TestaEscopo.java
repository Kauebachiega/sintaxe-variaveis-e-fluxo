
public class TestaEscopo {

	public static void main(String[] args) {
			
		
		System.out.println("Testando condicionais");

		int idade = 17;
		int quantidadePessoas = 2;
		boolean acompanhado;
		
		if (quantidadePessoas >=2 ) {
			acompanhado = true; 
		} else {
			 acompanhado = false;
		}
		
		if (idade >= 18 || acompanhado) {

			System.out.println("Parab�ns voc� est� matriculado na alura!");

		} else {
			System.out.println("voce n�o tem 18 anos, mas pode entrar porque est� acompanhado.");

		}

	}

}
