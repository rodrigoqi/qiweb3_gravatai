import java.util.Scanner;

public class VanConsole {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		Van van = new Van("ABC1512", (byte)20);
		
		int opcao = -1;
		
		while(opcao!=0) {
			System.out.println("Digite a opção desejada:");
			System.out.println("0 - encerrar o programa");
			System.out.println("1 - embarcar passageiros");
			System.out.println("2 - desembarcar passageiros");
			System.out.println("3 - ver o nº de lugares disponíveis");
			System.out.println("4 - ver informações completas da van");
			System.out.println("5 - modificar a placa");
			opcao = Integer.parseInt(leitor.nextLine());
			
			switch(opcao) {
				
				case 0:
					System.out.println("Até mais e obrigado por utilizar o programa!");
					break;
					
				case 1:
					System.out.println("Quantos passageiros desejam embarcar?");
					byte passageirosEmbarcar = Byte.parseByte(leitor.nextLine());
					van.embarcar(passageirosEmbarcar);
					break;
					
				case 2:
					System.out.println("Quantos passageiros irão desembarcar?");
					byte passageirosDesembarcar = Byte.parseByte(leitor.nextLine());
					van.desembarcar(passageirosDesembarcar);
					break;
				
				case 3:
					System.out.println("Lugares disponíveis: " + van.getDisponiveis());
					break;
					
				case 4:
					System.out.println(van.toString());
					break;
					
				case 5:
					System.out.println("Digite a nova placa");
					String placa = leitor.nextLine();
					van.setPlaca(placa);
					break;
					
				default:
					System.out.println("Opção inválida!");
					break;
				
			}
			
			
			/*if(opcao==0) {
				
			} else if(opcao==1) {
				
			} else if(opcao==2) {
				
			} else if(opcao==3) {
				
			} else if(opcao==4) {
				
			} else if(opcao==5) {
				
			} else {
				
			}*/
			
		}

	}

}
