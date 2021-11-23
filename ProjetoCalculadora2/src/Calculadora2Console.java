import java.util.Scanner;

public class Calculadora2Console {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);

		System.out.println("PROGRAMA DE DIVISÃO DE DOIS VALORES\n");
		
		System.out.println("Digite o valor 1:");
		int v1 = leitor.nextInt();
		
		System.out.println("Digite o valor 2:");
		int v2 = leitor.nextInt();
		
		int resultado = v1 / v2;
		
		System.out.println("A divisão é " + resultado);
	}

}
