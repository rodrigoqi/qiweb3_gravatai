import java.util.Scanner;

public class TabuadaMultiplicacaoConsole {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		
		int opcao = 1;
		
		while(opcao!=2) {
		
			System.out.println("TABUADA DA MULTIPLICA��O\n");
		
			System.out.println("Voc� deseja a tabuada de qual n�mero (0-10)?");
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
					System.out.println("Op��o inv�lida!");
				}
				
				System.out.println("Deseja visualizar outra tabuada? 1-Sim / 2-N�o");
				opcao = leitor.nextInt();
			}

		}

	}

}
