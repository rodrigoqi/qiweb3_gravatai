import java.util.Scanner;

public class CondicaoDescontoConsole {

	public static void main(String[] args) {
		// COMPRAS
		// at� 300,00 - sem desconto
		// acima 300,00 - desconto 10%

		Scanner leitor = new Scanner(System.in);
		
		System.out.println("PROGRAMA DE C�LCULO DE VALOR DE COMPRA");
		
		System.out.println("Digite o total das compras do cliente:");
		double total = leitor.nextDouble();
		
		double desconto;
		
		if(total<=300) {
			desconto = 0;
		} else {
			desconto = total * 10/100;		
		}
		
		System.out.println("O valor a ser cobrado � " + (total - desconto) );
		
		
	}

}
