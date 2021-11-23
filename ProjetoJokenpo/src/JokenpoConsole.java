import java.util.Scanner;

public class JokenpoConsole {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite um código de identificação:");
		int codigo = Integer.parseInt(leitor.nextLine());
		System.out.println("Digite o seu nome:");
		String nome = leitor.nextLine();
		
		Jokenpo joke = new Jokenpo(codigo, nome);
		
		int opcao = -1;
		
		while(opcao!=0) {
			System.out.println("BEM VINDO AO JOKENPÔ. O QUE DESEJA?");
			System.out.println("0 - Encerrar o jogo");
			System.out.println("1 - Ver informações do jogo");
			System.out.println("2 - Ver o nome do jogador");
			System.out.println("3 - Alterar o jogador");
			System.out.println("4 - Ver o aproveitamento do jogador");
			System.out.println("5 - Zerar estatísticas");
			System.out.println("6 - JOGAR!");
			opcao = Integer.parseInt(leitor.nextLine());
			
			switch(opcao) {
				case 0:
					System.out.println("Obrigado por jogar o Jokenpô!");
					break;
				
				case 1:
					System.out.println(joke.toString());
					break;
					
				case 2:
					System.out.println("Jogador: " + joke.getJogador());
					break;
					
				case 3:
					System.out.println("Digite o nome do novo jogador:");
					String novoJogador = leitor.nextLine();
					joke.setJogador(novoJogador);
					
				case 4:
					System.out.println("Aproveitamento: " 
							+ joke.getAproveitamento() + "%");
					break;
				
				case 5:
					joke.zerarEstatisticas();
					break;
					
				case 6:
					System.out.println("Qual a sua jogada? 0-Pedra / 1 -Papel / 2-Tesoura");
					int escolha = Integer.parseInt(leitor.nextLine());
					System.out.println(joke.jogar(escolha));
					break;
					
				default:
					System.out.println("Opção inválida!");
					break;
			}
		}

	}

}
