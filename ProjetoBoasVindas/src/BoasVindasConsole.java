import java.util.Scanner;

public class BoasVindasConsole {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite o seu nome:");
		String nome = leitor.nextLine();
		
		System.out.println("Digite o seu sexo (M ou F ou I):");
		String sexo = leitor.nextLine();
		
		if(sexo.toUpperCase().equals("F")) {
			System.out.println("Bem vinda " + nome);
		}
		
		if(sexo.toUpperCase().equals("M")) {
			System.out.println("Bem vindo " + nome);
		}
		
		if(sexo.toUpperCase().equals("I")){
			System.out.println("Bem vinde " + nome);
		}

	}

}
