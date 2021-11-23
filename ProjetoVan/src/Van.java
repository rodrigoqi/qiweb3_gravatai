
public class Van {
	private String placa;
	private String cor;
	private short ano;
	private String modelo;
	private String motorista;
	private byte capacidade;
	private byte ocupacao;
	
	public Van(String placa, byte capacidade) {
		this.placa = placa;
		this.capacidade = capacidade;
		this.ocupacao = 0;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		if(placa.length() == 7) {
			this.placa = placa;
		} else {
			System.out.println("A placa deve conter 7 caracteres!");
		}
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public short getAno() {
		return ano;
	}

	public void setAno(short ano) {
		this.ano = ano;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMotorista() {
		return motorista;
	}

	public void setMotorista(String motorista) {
		this.motorista = motorista;
	}

	public byte getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(byte capacidade) {
		this.capacidade = capacidade;
	}

	public byte getOcupacao() {
		return ocupacao;
	}

	public void setOcupacao(byte ocupacao) {
		this.ocupacao = ocupacao;
	}

	@Override
	public String toString() {
		return "Van [placa=" + placa + ", cor=" + cor + ", ano=" + ano + ", modelo=" + modelo + ", motorista="
				+ motorista + ", capacidade=" + capacidade + ", ocupacao=" + ocupacao + "]";
	}
	
	public void embarcar(byte passageiros) {
		byte disponiveis = (byte)(this.capacidade - this.ocupacao);
		if(disponiveis >= passageiros) {
			this.ocupacao += passageiros;
		} else {
			this.ocupacao += disponiveis;
			System.out.println((passageiros - disponiveis) 
					+ " passageiro(s) não conseguiu(ram) embarcar");
		}
	}
	
	public void desembarcar(byte passageiros) {
		if(passageiros <= this.ocupacao) {
			this.ocupacao -= passageiros;
		} else {
			System.out.println("ERRO! O total de passageiros desembarcando não pode ser "
					+ "maior que o total de passageiros na Van");
		}
	}
	
	
	public byte getDisponiveis() {
		return (byte)(this.capacidade - this.ocupacao);
	}
	
	
	
	
	
	
}
