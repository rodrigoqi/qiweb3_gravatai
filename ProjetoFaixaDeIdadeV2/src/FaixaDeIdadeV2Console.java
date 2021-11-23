import java.util.Scanner;

public class FaixaDeIdadeV2Console {

	public static void main(String[] args) {
		/* 0 - 3: bebê
		 * 4 - 9: criança
		 * 10 - 12: pré-adolescente
		 * 13 - 19: adolescente
		 * 20 - 29: jovem
		 * 30 - 35: adulto jovem
		 * 36 - 59: adulto
		 * 60 - 80: idoso
		 * a partir de 81: ancião
		 */

		Scanner leitor = new Scanner(System.in);
		
		System.out.println("PROGRAMA DE FAIXA DE IDADE\n");
		
		System.out.println("Digite uma idade:");
		int idade = leitor.nextInt();
		
		if( (idade>=0) && (idade<=3) ) {
			System.out.println("Bebê");
		} else if( idade<=9 ) {
			System.out.println("Criança");
		} else if( idade<=12 ) {
			System.out.println("Pré-adolescente");
		} else if( idade<=19 ) {
			System.out.println("Adolescente");
		} else if( idade<=29 ) {
			System.out.println("Jovem");
		} else if( idade<=35 ) {
			System.out.println("Adulto jovem");
		} else if( idade<=59 ) {
			System.out.println("Adulto");
		} else if( idade<=80 ) {
			System.out.println("Idoso");
		} else if( idade<=130 ) {
			System.out.println("Ancião");
		} else {
			System.out.println("Idade inválida. Digite uma idade entre 0 e 130 anos!");
		}

	}

}
