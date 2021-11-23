
public class DescontoConsole {

	public static void main(String[] args) {
		//criar um programa que peça o nome de um produto, o valor
		//desse produto e o valor de um desconto percentual dado
		//sobre o produto. Ao final, calcular o total do desconto
		//e mostrar para o usuário uma mensagem como a abaixo
		//(mostrando o nome do produto e o valor do desconto 
		//calculado):
		//O desconto para o Xiaomi 10s é de 150.2
		//OBS: valor * (percentual / 100)
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("PROGRAMA DE CÁLCULO DE DESCONTO\n");
		
		System.out.println("Digite o nome do produto:");
		String produto = leitor.nextLine();
		
		System.out.println("Digite o preço do produto:");
		double preco = leitor.nextDouble();
		
		System.out.println("Digite o desconto percentual:");
		double percentual = leitor.nextDouble();
		
		double desconto = preco * percentual / 100;
		
		System.out.println("O desconto para o produto " + produto + " é de " + desconto);
		
		
	}

}
