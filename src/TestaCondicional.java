
public class TestaCondicional {

	public static void main(String[] args) {
		System.out.println("Testando condicionais");

		int idade = 18;
		int quantidadePessoas = 17;

		if (idade >= 18) {

			System.out.println("Parab�ns voc� est� matriculado na alura!");

		} else {
			if (quantidadePessoas >= 17) {
				System.out.println("voce n�o tem 18 anos, mas pode entrar porque est� acompanhado.");
			}
			else {
		
				System.out.println("Desculpe, apenas maiores de 18 anos pode realizar esste curso.");
			}
		}
	}

}
