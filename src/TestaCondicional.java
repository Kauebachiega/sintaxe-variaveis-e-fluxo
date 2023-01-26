
public class TestaCondicional {

	public static void main(String[] args) {
		System.out.println("Testando condicionais");

		int idade = 18;
		int quantidadePessoas = 17;

		if (idade >= 18) {

			System.out.println("Parabéns você está matriculado na alura!");

		} else {
			if (quantidadePessoas >= 17) {
				System.out.println("voce não tem 18 anos, mas pode entrar porque está acompanhado.");
			}
			else {
		
				System.out.println("Desculpe, apenas maiores de 18 anos pode realizar esste curso.");
			}
		}
	}

}
