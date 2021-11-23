
public class ContaCorrente {
	
	//PASSO 1: CRIA��O DOS ATRIBUTOS
	private int conta;
	private String titular;
	private String cpf;
	private String senha;
	private float saldo;
	
	//PASSO 2: CRIA��O DO(S) M�TODO(S) CONSTRUTOR(ES)
	public ContaCorrente(int conta, String titular, String cpf, String senha) {
		this.conta = conta;
		this.titular = titular;
		this.cpf = cpf;
		this.senha = senha;
		this.saldo = 0;
	}
	
	//PASSO 3: CRIA��O DOS GETTERS E DOS SETTERS
	public int getConta() {
		return this.conta;
	}
	public String getTitular() {
		return this.titular;
	}
	public String getCpf() {
		return this.cpf;
	}
	public float getSaldo(String senhaAtual) {
		if(this.senha.equals(senhaAtual)) {
			return this.saldo;
		} else {
			System.out.println("SENHA INCORRETA!");
			return -1;
		}
	}
	public void setTitular(String novoTitular) {
		this.titular = novoTitular;
	}
	public void setCpf(String novoCpf) {
		this.cpf = novoCpf;
	}
	public void setSenha(String novaSenha, String senhaAtual) {
		if(this.senha.equals(senhaAtual)) {
			this.senha = novaSenha;
		} else {
			System.out.println("SENHA INCORRETA!");
		}
	}
	
	//PASSO 4: CRIA��O DO TOSTRING
	public String toString() {
		String texto = "";
		texto = texto + "N�mero da conta: " + this.conta + "\n";
		texto = texto + "Titular da conta: " + this.titular + "\n";
		texto = texto + "CPF do titular: " + this.cpf;
		return texto;
	}
	
	//PASSO 5: CRIA��O DOS M�TODOS ESPECIAIS
	public void sacar(float valor, String senhaAtual) {
		if(this.senha.equals(senhaAtual)) {
			if(valor <= this.saldo) {
				this.saldo = this.saldo - valor;
			} else {
				System.out.println("SALDO INSUFICIENTE!");
			}
		}
	}
	public void depositar(float valor, String senhaAtual) {
		if(this.senha.equals(senhaAtual)) {
			this.saldo = this.saldo + valor;
		}
	}
	
	
}
