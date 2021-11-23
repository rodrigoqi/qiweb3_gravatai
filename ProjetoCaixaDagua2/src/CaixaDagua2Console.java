import java.util.Scanner;

public class CaixaDagua2Console {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		
		System.out.println("APP DE CÁLCULO DE LITROS EM CAIXA D'ÁGUA\n");
		
		System.out.println("Digite a altura:");
		double altura = leitor.nextDouble();
		
		System.out.println("Digite a largura:");
		double largura = leitor.nextDouble();
		
		System.out.println("Digite o comprimento:");
		double comprimento = leitor.nextDouble();
		
		double resultado = altura * largura * comprimento * 1000;
		
		System.out.println("O resultado é " + resultado + " litros");

	}

}
