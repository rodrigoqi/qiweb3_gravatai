import java.util.Scanner;

public class MediaSituacaoConsole {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("PROGRAMA DE CÁLCULO DE MÉDIA FINAL");
		
		System.out.println("Digite o nome do aluno:");
		String nome = leitor.nextLine();
		
		System.out.println("Digite a nota 1:");
		double n1 = leitor.nextDouble();
		
		System.out.println("Digite a nota 2:");
		double n2 = leitor.nextDouble();
		
		double resultado = (n1 + n2)/2;
		
		System.out.println("A média de " + nome + " é de " + resultado);
		
		if(resultado>=6) {
			System.out.println("O aluno está aprovado!");
		} else {
			System.out.println("O aluno está reprovado!");
		}

	}

}
