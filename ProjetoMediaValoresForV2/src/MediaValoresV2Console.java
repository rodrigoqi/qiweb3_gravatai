import java.util.Scanner;

public class MediaValoresV2Console {

	public static void main(String[] args) {
		
Scanner leitor = new Scanner(System.in);
		
		System.out.println("PROGRAMA DE MÉDIA DE VALORES DIGITADOS\n");
		
		double soma = 0;
		
		System.out.println("Quantos valores você deseja inserir?");
		int qtde = leitor.nextInt();
		
		for(int cont=1; cont<=qtde; cont++) {
			System.out.println("Digite o valor " + cont);
			soma = soma + leitor.nextDouble();
		}
		
		double media = soma / qtde;
		
		System.out.println("A média dos valores é " + media);		


	}

}
