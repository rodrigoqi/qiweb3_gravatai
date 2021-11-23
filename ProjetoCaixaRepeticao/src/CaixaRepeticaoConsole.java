import java.util.Scanner;

public class CaixaRepeticaoConsole {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		
		int opcao = 1;
		
		while(opcao!=2) {
			System.out.println("CÁLCULO DE LITROS DE CAIXA RETANGULAR\n");
			System.out.println("Digite a largura da caixa:");
			double largura = leitor.nextDouble();
			System.out.println("Digite o comprimento da caixa:");
			double comprimento = leitor.nextDouble();
			System.out.println("Digite a altura da caixa:");
			double altura = leitor.nextDouble();
			double litros = largura * altura * comprimento * 1000;
			System.out.println("O total de litros da caixa é " + litros);
			
			System.out.println("Continuar? 1-Sim / 2-Não");
			opcao = leitor.nextInt();
		}
		
		System.out.println("OBRIGADO POR UTILIZAR NOSSO SISTEMA!");

	}

}
