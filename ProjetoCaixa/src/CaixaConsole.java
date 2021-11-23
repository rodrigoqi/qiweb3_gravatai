import java.util.Scanner;

public class CaixaConsole {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		Caixa cx = new Caixa(1);

		int opcao = -1;
		
		while(opcao!=0) {
			System.out.println("**************************************");
			System.out.println("O QUE DESEJA FAZER?");
			System.out.println("0 - Sair");
			System.out.println("1 - Ver informações da caixa");
			System.out.println("2 - Mudar a cor da caixa");
			System.out.println("3 - Mudar medidas da caixa");
			System.out.println("4 - Calcular área da caixa");
			System.out.println("5 - Calcular volume da caixa");
			opcao = Integer.parseInt(leitor.nextLine());
			System.out.println("**************************************");
			
			if(opcao==0) {
				System.out.println("Muito obrigado e até breve!");
			} else if(opcao==1) {
				System.out.println(cx.toString());
			} else if(opcao==2) {
				System.out.println("Qual a nova cor da caixa?");
				cx.setCor(leitor.nextLine());
			} else if(opcao==3) {
				System.out.println("Qual a nova altura da caixa?");
				cx.setAltura(Float.parseFloat(leitor.nextLine()));
				System.out.println("Qual a nova largura da caixa?");
				cx.setLargura(Float.parseFloat(leitor.nextLine()));
				System.out.println("Qual o novo comprimento da caixa?");
				cx.setComprimento(Float.parseFloat(leitor.nextLine()));
			} else if(opcao==4) {
				System.out.println("A área da caixa é " + cx.calcularArea());
			} else if(opcao==5) {
				System.out.println("O volume da caixa é " + cx.calcularVolume());
			} else {
				System.out.println("Opção inválida!");
			}
		}
	
	}

}
