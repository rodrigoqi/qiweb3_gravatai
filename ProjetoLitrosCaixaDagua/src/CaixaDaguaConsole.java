
public class CaixaDaguaConsole {

	public static void main(String[] args) {
		System.out.println("********************************************");
		System.out.println("Sistema de c�lculo de litros de caixa d'�gua");
		System.out.println("********************************************");
		
		double largura = 2.5;
		double altura = 1.89;
		double comprimento = 1.666;
		
		double resultado = largura * altura * comprimento * 1000;
		
		System.out.println("Largura: " + largura + "m");
		System.out.println("Altura: " + altura + "m");
		System.out.println("Comprimento: " + comprimento + "m");
		
		System.out.println("O volume � " + resultado + " litros");
	}

}
