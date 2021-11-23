import java.util.Scanner;

public class MediaValoresConsole {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		
		System.out.println("PROGRAMA DE MÉDIA DE VALORES DIGITADOS\n");
		
		int cont = 0;      //variável do tipo CONTADOR
		double soma = 0;   //variável do tipo ACUMULADOR
		
		while(cont < 10) {
			cont++;
			System.out.println("Digite o valor " + cont);
			soma = soma + leitor.nextDouble();
		}

		double media = soma / 10;
		
		System.out.println("A média dos valores digitados é " + media);		
	}

}
