import java.util.Scanner;

public class CaixaRepeticaoV2Console {

	public static void main(String[] args) {
Scanner leitor = new Scanner(System.in);
		
		String opcao = "S";
		
		while(opcao.toUpperCase().equals("S")) {
			System.out.println("CÁLCULO DE LITROS DE CAIXA RETANGULAR\n");
			System.out.println("Digite a largura da caixa:");
			double largura = Double.parseDouble(leitor.nextLine());
			System.out.println("Digite o comprimento da caixa:");
			double comprimento = Double.parseDouble(leitor.nextLine());
			System.out.println("Digite a altura da caixa:");
			double altura = Double.parseDouble(leitor.nextLine());
			double litros = largura * altura * comprimento * 1000;
			System.out.println("O total de litros da caixa é " + litros);
			
			System.out.println("Continuar? S-Sim / N-Não");
			opcao = leitor.nextLine();
		}
		
		System.out.println("OBRIGADO POR UTILIZAR NOSSO SISTEMA!");

	}

}
