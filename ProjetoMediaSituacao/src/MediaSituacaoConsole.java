import java.util.Scanner;

public class MediaSituacaoConsole {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("PROGRAMA DE C�LCULO DE M�DIA FINAL");
		
		System.out.println("Digite o nome do aluno:");
		String nome = leitor.nextLine();
		
		System.out.println("Digite a nota 1:");
		double n1 = leitor.nextDouble();
		
		System.out.println("Digite a nota 2:");
		double n2 = leitor.nextDouble();
		
		double resultado = (n1 + n2)/2;
		
		System.out.println("A m�dia de " + nome + " � de " + resultado);
		
		if(resultado>=6) {
			System.out.println("O aluno est� aprovado!");
		} else {
			System.out.println("O aluno est� reprovado!");
		}

	}

}
