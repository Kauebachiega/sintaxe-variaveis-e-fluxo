
public class TestaCondicional2 {

	public static void main(String[] args) {
		System.out.println("Testando condicionais");

		int idade = 17;
		int quantidadePessoas = 2;
		boolean acompanhado = quantidadePessoas >= 2;

		if (idade >= 18 || acompanhado) {

			System.out.println("Parab�ns voc� est� matriculado na alura!");

		} else if (idade >= 17 || quantidadePessoas >= 0) {
			System.out.println("Voc� n�o pode entrar � menor de 18 anos e n�o est� acompanhado.");
		} else {
			System.out.println("voce n�o tem 18 anos, mas pode entrar porque est� acompanhado.");

		}

	}
}
