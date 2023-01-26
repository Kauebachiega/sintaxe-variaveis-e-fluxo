
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

			System.out.println("Parabéns você está matriculado na alura!");

		} else {
			System.out.println("voce não tem 18 anos, mas pode entrar porque está acompanhado.");

		}

	}

}
