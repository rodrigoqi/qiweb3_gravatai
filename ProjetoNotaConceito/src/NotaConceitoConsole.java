import java.util.Scanner;

public class NotaConceitoConsole {

	public static void main(String[] args) {
		
		//Conceito A: de 8.5 à 10.0
		//Conceito B: de 7.5 à menos que 8.5
		//Conceito C: de 6.0 à menos que 7.5
		//Conceito D: de 4.0 à menos que 6.0
		//Conceito E: de 2.0 à menos que 4.0
		//Conceito F: menos que 2.0
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Programa de conversão de nota em conceito\n");
		
		System.out.println("Digite uma nota entre 0 e 10:");
		double nota = leitor.nextDouble();
		
		if( (nota >= 8.5) && (nota <= 10) ) {
			System.out.println("Conceito A");
		} else if( (nota >= 7.5) && (nota < 8.5) ) {
			System.out.println("Conceito B");
		} else if( (nota >= 6.0) && (nota < 7.5) ) {
			System.out.println("Conceito C");
		} else if( (nota >= 4.0) && (nota < 6.0) ) {
			System.out.println("Conceito D");
		} else if( (nota >= 2.0) && (nota < 4.0) ) {
			System.out.println("Conceito E");
		} else if( (nota >=0) && (nota < 2.0) ) {
			System.out.println("Conceito F");
		} else {
			System.out.println("Nota inválida!");
		}
		
		

	}

}
