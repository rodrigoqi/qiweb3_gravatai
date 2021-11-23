import java.util.Scanner;

public class MediaValoresForConsole {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		
		System.out.println("PROGRAMA DE MÉDIA DE VALORES DIGITADOS\n");
		
		double soma = 0;
		
		//fo(int cont=0; cont<10; cont++) {
		for(int cont=1; cont<=10; cont++) {
			System.out.println("Digite o valor " + cont);
			soma = soma + leitor.nextDouble();
		}
		
		double media = soma / 10;
		
		System.out.println("A média dos valores é " + media);		

	}

}
