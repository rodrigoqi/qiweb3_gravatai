import java.util.Scanner;

public class CadastroConsole {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("PROGRAMA DE CADASTRO\n");
		
		System.out.println("Digite o seu nome:");
		String nome = leitor.nextLine();
		
		System.out.println("Digite o seu sexo:");
		String sexo = leitor.nextLine();
		
		System.out.println("Digite o seu telefone:");
		String telefone = leitor.nextLine();
		
		System.out.println("Digite a sua idade:");
		int idade = leitor.nextInt();
		
		System.out.println("Digite o seu salário:");
		double salario = leitor.nextDouble();
		
		System.out.println("Digite o número de filhos:");
		int filhos = leitor.nextInt();
		
		System.out.println("Digite o seu peso:");
		double peso = leitor.nextDouble();
		
		System.out.println("Digite a sua altura:");
		double altura = leitor.nextDouble();
		
		System.out.println("\n___________________________________________");
		System.out.println("Confira as suas informações:");
		System.out.println("Nome: " + nome);
		System.out.println("Sexo: " + sexo);
		System.out.println("Telefone: " + telefone);
		System.out.println("Idade: " + idade + " anos");
		System.out.println("Salário: " + salario);
		System.out.println("Filhos: " + filhos);
		System.out.println("Peso: " + peso + " kg");
		System.out.println("Altura: " + altura + " m");
		
		
	}

}
