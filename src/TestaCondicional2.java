
public class TestaCondicional2 {

	public static void main(String[] args) {
		System.out.println("Testando condicionais");

		int idade = 17;
		int quantidadePessoas = 2;
		boolean acompanhado = quantidadePessoas >= 2;

		if (idade >= 18 || acompanhado) {

			System.out.println("Parabéns você está matriculado na alura!");

		} else if (idade >= 17 || quantidadePessoas >= 0) {
			System.out.println("Você não pode entrar é menor de 18 anos e não está acompanhado.");
		} else {
			System.out.println("voce não tem 18 anos, mas pode entrar porque está acompanhado.");

		}

	}
}
