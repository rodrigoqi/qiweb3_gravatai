import java.util.Scanner;

public class MediaValoresV2Console {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("PROGRAMA DE M�DIA DE VALORES DIGITADOS\n");
		
		int cont = 0;      //vari�vel do tipo CONTADOR
		double soma = 0;   //vari�vel do tipo ACUMULADOR
		
		System.out.println("Quantos valores voc� quer inserir?");
		int qtde = leitor.nextInt();
		
		while(cont < qtde) {
			cont++;
			System.out.println("Digite o valor " + cont);
			soma = soma + leitor.nextDouble();
		}

		double media = soma / qtde;
		
		System.out.println("A m�dia dos valores digitados � " + media);		

	}

}
