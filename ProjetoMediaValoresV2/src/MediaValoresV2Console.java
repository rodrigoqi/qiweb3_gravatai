import java.util.Scanner;

public class MediaValoresV2Console {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("PROGRAMA DE MÉDIA DE VALORES DIGITADOS\n");
		
		int cont = 0;      //variável do tipo CONTADOR
		double soma = 0;   //variável do tipo ACUMULADOR
		
		System.out.println("Quantos valores você quer inserir?");
		int qtde = leitor.nextInt();
		
		while(cont < qtde) {
			cont++;
			System.out.println("Digite o valor " + cont);
			soma = soma + leitor.nextDouble();
		}

		double media = soma / qtde;
		
		System.out.println("A média dos valores digitados é " + media);		

	}

}
