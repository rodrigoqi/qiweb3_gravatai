import java.util.Scanner;

public class FaixaDeIdadeConsole {

	public static void main(String[] args) {
		
		/* 0 - 3: beb�
		 * 4 - 9: crian�a
		 * 10 - 12: pr�-adolescente
		 * 13 - 19: adolescente
		 * 20 - 29: jovem
		 * 30 - 35: adulto jovem
		 * 36 - 59: adulto
		 * 60 - 80: idoso
		 * a partir de 81: anci�o
		 */

		Scanner leitor = new Scanner(System.in);
		
		System.out.println("PROGRAMA DE FAIXA DE IDADE\n");
		
		System.out.println("Digite uma idade:");
		int idade = leitor.nextInt();
		
		if( (idade>=0) && (idade<=3) ) {
			System.out.println("Beb�");
		} else if( (idade>=4) && (idade<=9) ) {
			System.out.println("Crian�a");
		} else if( (idade>=10) && (idade<=12) ) {
			System.out.println("Pr�-adolescente");
		} else if( (idade>=13) && (idade<=19) ) {
			System.out.println("Adolescente");
		} else if( (idade>=20) && (idade<=29) ) {
			System.out.println("Jovem");
		} else if( (idade>=30) && (idade<=35) ) {
			System.out.println("Adulto jovem");
		} else if( (idade>=36) && (idade<=59) ) {
			System.out.println("Adulto");
		} else if( (idade>=60) && (idade<=80) ) {
			System.out.println("Idoso");
		} else if(idade>=81 && (idade<=130) ) {
			System.out.println("Anci�o");
		} else {
			System.out.println("Idade inv�lida. Digite uma idade entre 0 e 130 anos!");
		}
		
	}

}
