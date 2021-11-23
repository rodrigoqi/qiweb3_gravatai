
public class Caixa {
	
	//A classe � formada de duas coisas fundamentais: atributos e m�todos
	
	//Atributos: geralmente s�o privados e � necess�rio um identificador
	private int codigo;
	private String cor;
	private float altura;
	private float largura;
	private float comprimento;
	
	//M�todos: construtor, gets e sets, toString e m�todos especiais
	
	//M�todo construtor 1 (informamos somente o c�digo ao criar a caixa)
	public Caixa(int codigo) {
		this.codigo = codigo;
		this.cor = "";
		this.altura = 0;
		this.largura = 0;
		this.comprimento = 0;
	}
	
	//M�todo construtor 2 (informamos tudo ao criar a caixa)
	public Caixa(int codigo, String cor, float altura, float largura, float comprimento) {
		this.codigo = codigo;
		this.cor = cor;
		this.altura = altura;
		this.largura = largura;
		this.comprimento = comprimento;
	}
	
	//M�todos Get: m�todos que devolvem o valor de um atributo da classe
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
	
	
	//M�todos Set: m�todos que modificam o valor de um atributo da classe
	
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
		texto = texto + "C�digo: " + this.codigo + "\n";
		texto = texto + "Cor: " + this.cor + "\n";
		texto = texto + "Altura: " + this.altura + "\n";
		texto = texto + "Largura: " + this.largura + "\n";
		texto = texto + "Comprimento: " + this.comprimento + "\n";
		texto = texto + "Volume: " + calcularVolume() + "\n";
		texto = texto + "�rea: " + calcularArea();
		return texto;
	}
	
}
