package farmacia;

public class Produto {
	
	private String nome;
	private String codigo;
	private double valor;
	private String dataVencimento;
	private int estoque;
	
	public Produto(String nome, String codigo, double valor, String dataVencimento, int estoque) {
		this.nome = nome;
		this.codigo = codigo;
		this.valor = valor;
		this.dataVencimento = dataVencimento;
		this.estoque = estoque;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCodigo() {
		return codigo;
	}


	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getDataVencimento() {
		return dataVencimento;
	}

	public int getEstoque() {
		return estoque;
	}

	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}

	@Override
	public String toString() {
		return "O produto "  + getNome() + " tá custando R$ " + getValor();
	}
}
