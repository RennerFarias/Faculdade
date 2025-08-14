package banco;

public class Cliente {
	
	private String nome;
	private String cpf;
	private String endereco;
	
	public Cliente(String nomeInput, String cpf, String endereco) {
		this.nome = nomeInput;
		this.cpf = cpf;
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", cpf=" + cpf + ", endereco=" + endereco + "]";
	}

}
