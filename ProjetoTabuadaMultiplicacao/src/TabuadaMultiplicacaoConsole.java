import java.util.Scanner;

public class TabuadaMultiplicacaoConsole {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		
		int opcao = 1;
		
		while(opcao!=2) {
		
			System.out.println("TABUADA DA MULTIPLICAÇÃO\n");
		
			System.out.println("Você deseja a tabuada de qual número (0-10)?");
			int numero = leitor.nextInt();
		
			for(int cont=0; cont<=10; cont++) {
				System.out.println(numero + " x " + cont + " = " + (numero*cont));
			}
			
			
			opcao = 0;
			
			boolean primeiraVez = true;
			
			while(opcao!=1 && opcao!=2) {
				if(primeiraVez) {
					primeiraVez = false;
				} else {
					System.out.println("Opção inválida!");
				}
				
				System.out.println("Deseja visualizar outra tabuada? 1-Sim / 2-Não");
				opcao = leitor.nextInt();
			}

		}

	}

}
