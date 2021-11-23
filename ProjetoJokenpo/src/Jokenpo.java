import java.util.Random;

public class Jokenpo {
	private int codigo;
	private String jogador;
	private short partidas;
	private short vitorias;
	private short empates;
	private short derrotas;
	
	public Jokenpo(int codigo, String jogador) {
		this.codigo = codigo;
		this.jogador = jogador;
		zerarEstatisticas();
	}

	public String getJogador() {
		return jogador;
	}

	public void setJogador(String jogador) {
		this.jogador = jogador;
		zerarEstatisticas();
	}

	@Override
	public String toString() {
		return "Jokenpo [jogador=" + jogador + ", partidas=" + partidas + ", vitorias=" + vitorias + ", empates="
				+ empates + ", derrotas=" + derrotas + "]";
	}
	
	public float getAproveitamento() {
		if((this.vitorias + this.derrotas)!=0) {
			return ((float)this.vitorias / 
				((float)this.vitorias + (float)this.derrotas)) * 100;
		} else {
			System.out.println("Não existem estatísticas a exibir");
			return 0;
		}
	}
	
	public String jogar(int escolhaJogador) {
		//0 - pedra / 1 - papel / 2 - tesoura
		
		this.partidas++;
		
		Random sorteio = new Random();
		int escolhaPc = sorteio.nextInt(3);
		
		String mensagem = "A jogada do PC foi ";
		
		if(escolhaPc==0) {
			mensagem += "Pedra";
		} else if(escolhaPc==1) {
			mensagem += "Papel";
		} else {
			mensagem += "Tesoura";
		}
		
		if(escolhaJogador == escolhaPc) {
			this.empates++;
			mensagem += "\nVocê empatou!";
		} else if((escolhaJogador==0 && escolhaPc==2) 
				|| (escolhaJogador==1 && escolhaPc==0)
				|| (escolhaJogador==2 && escolhaPc==1)) {
			this.vitorias++;
			mensagem += "\nVocê venceu!";
		} else {
			this.derrotas++;
			mensagem += "\nVocê perdeu!";
		}
		
		return mensagem;
	}
	
	public void zerarEstatisticas() {
		this.partidas = 0;
		this.empates = 0;
		this.vitorias = 0;
		this.derrotas = 0;
	}
	
}
