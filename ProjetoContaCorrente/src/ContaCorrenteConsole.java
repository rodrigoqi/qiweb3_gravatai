import java.util.Random;
import java.util.Scanner;

public class ContaCorrenteConsole {

	public static void main(String[] args) {
		
		ContaCorrente cc = null;
		
		Scanner leitor = new Scanner(System.in);

		int opcao = -1;
		
		while(opcao!=0) {
			System.out.println("******************************************");
			System.out.println("O que você deseja fazer?");
			System.out.println("0 - sair");
			System.out.println("1 - criar conta");
			System.out.println("2 - depositar");
			System.out.println("3 - sacar");
			System.out.println("4 - ver saldo");
			System.out.println("5 - ver dados da conta");
			System.out.println("6 - alterar titular");
			opcao = Integer.parseInt(leitor.nextLine());
			System.out.println("******************************************");
			
			if(opcao==0) {
				System.out.println("Obrigado por utilizado o nosso sistema");
			} else if(opcao==1) {
				System.out.println("Digite o nome do titular da conta:");
				String nome = leitor.nextLine();
				System.out.println("Digite o CPF do titular da conta:");
				String cpf = leitor.nextLine();
				System.out.println("Digite a senha da conta:");
				String senha = leitor.nextLine();
				Random gerador = new Random();
				int conta = gerador.nextInt();
				cc = new ContaCorrente(conta, nome, cpf, senha);
			} else if(opcao==2 && cc!=null) {
				System.out.println("Digite o valor depositado:");
				float valor = Float.parseFloat(leitor.nextLine());
				System.out.println("Por favor, confirme a senha de sua conta:");
				String senha = leitor.nextLine();
				cc.depositar(valor, senha);
			} else if(opcao==3 && cc!=null) {
				System.out.println("Digite o valor a ser sacado:");
				float valor = Float.parseFloat(leitor.nextLine());
				System.out.println("Por favor, confirme a senha de sua conta:");
				String senha = leitor.nextLine();
				cc.sacar(valor, senha);
			} else if(opcao==4 && cc!=null) {
				System.out.println("Por favor, confirme a senha de sua conta:");
				String senha = leitor.nextLine();
				System.out.println("Saldo da conta: " + cc.getSaldo(senha));
			} else if(opcao==5 && cc!=null) {
				System.out.println(cc.toString());
			} else if(opcao==6 && cc!=null) {
				System.out.println("Digite o nome do novo titular:");
				String nome = leitor.nextLine();
				System.out.println("Digite o CPF do novo titular:");
				String cpf = leitor.nextLine();
				cc.setTitular(nome);
				cc.setCpf(cpf);
			} else {
				System.out.println("Opção inválida");
			}
				
		}
	}

}
