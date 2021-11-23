import java.util.Scanner;

public class MediaValoresForV3Console {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("PROGRAMA DE MÉDIA DE VALORES DIGITADOS\n");
		
		double soma = 0;
		int opcao = 1;
		
		int cont;
		
		for(cont=1; opcao!=2; cont++) {
			System.out.println("Digite o valor " + cont);
			soma = soma + leitor.nextDouble();
			
			System.out.println("Deseja inserir um novo valor? 1-Sim / 2-Não");
			opcao = leitor.nextInt();
		}
		
		double media = soma / cont;
		
		System.out.println("A média dos valores é " + media);

	}

}
