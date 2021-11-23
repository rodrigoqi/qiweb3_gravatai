
public class Caixa {
	
	//A classe é formada de duas coisas fundamentais: atributos e métodos
	
	//Atributos: geralmente são privados e é necessário um identificador
	private int codigo;
	private String cor;
	private float altura;
	private float largura;
	private float comprimento;
	
	//Métodos: construtor, gets e sets, toString e métodos especiais
	
	//Método construtor 1 (informamos somente o código ao criar a caixa)
	public Caixa(int codigo) {
		this.codigo = codigo;
		this.cor = "";
		this.altura = 0;
		this.largura = 0;
		this.comprimento = 0;
	}
	
	//Método construtor 2 (informamos tudo ao criar a caixa)
	public Caixa(int codigo, String cor, float altura, float largura, float comprimento) {
		this.codigo = codigo;
		this.cor = cor;
		this.altura = altura;
		this.largura = largura;
		this.comprimento = comprimento;
	}
	
	//Métodos Get: métodos que devolvem o valor de um atributo da classe
	public int getCodigo() {
		return this.codigo;
	}
	
	public String getCor() {
		return this.cor;
	}
	
	public float getAltura() {
		return this.altura;
	}
	
	public float getLargura() {
		return this.largura;
	}
	
	public float getComprimento() {
		return this.comprimento;
	}
	
	
	//Métodos Set: métodos que modificam o valor de um atributo da classe
	
	public void setCodigo(int novoCodigo) {
		this.codigo = novoCodigo;
	}
	
	public void setCor(String novaCor) {
		this.cor = novaCor;
	}
	
	public void setAltura(float novaAltura) {
		this.altura = novaAltura;
	}
	
	public void setLargura(float novaLargura) {
		this.largura = novaLargura;
	}
	
	public void setComprimento(float novoComprimento) {
		this.comprimento = novoComprimento;
	}
	
	public float calcularVolume() {
		float volume = this.altura * this.largura * this.comprimento;
		return volume;
	}
	
	public float calcularArea() {
		float area = 2 * this.largura * this.altura + 2 * this.altura * this.comprimento
				+ 2 * this.largura * this.comprimento;
		return area;
	}
	
	public String toString() {
		String texto = "";
		texto = texto + "Código: " + this.codigo + "\n";
		texto = texto + "Cor: " + this.cor + "\n";
		texto = texto + "Altura: " + this.altura + "\n";
		texto = texto + "Largura: " + this.largura + "\n";
		texto = texto + "Comprimento: " + this.comprimento + "\n";
		texto = texto + "Volume: " + calcularVolume() + "\n";
		texto = texto + "Área: " + calcularArea();
		return texto;
	}
	
}
