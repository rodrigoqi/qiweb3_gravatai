import java.util.Scanner;

public class MediaValoresConsole {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		
		System.out.println("PROGRAMA DE M�DIA DE VALORES DIGITADOS\n");
		
		int cont = 0;      //vari�vel do tipo CONTADOR
		double soma = 0;   //vari�vel do tipo ACUMULADOR
		
		while(cont < 10) {
			cont++;
			System.out.println("Digite o valor " + cont);
			soma = soma + leitor.nextDouble();
		}

		double media = soma / 10;
		
		System.out.println("A m�dia dos valores digitados � " + media);		
	}

}
