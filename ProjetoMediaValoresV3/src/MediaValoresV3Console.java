import java.util.Scanner;

public class MediaValoresV3Console {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("PROGRAMA DE M�DIA DE VALORES DIGITADOS\n");
		
		int cont = 0;      //vari�vel do tipo CONTADOR
		double soma = 0;   //vari�vel do tipo ACUMULADOR
		int opcao = 1;
		
		while(opcao!=2) {
			cont++;
			System.out.println("Digite o valor " + cont);
			soma = soma + leitor.nextDouble();
			
			
			System.out.println("Digitar mais um valor? 1-Sim / 2-N�o");
			opcao = leitor.nextInt();
		}

		double media = soma / cont;
		
		System.out.println("A m�dia dos valores digitados � " + media);		


	}

}
