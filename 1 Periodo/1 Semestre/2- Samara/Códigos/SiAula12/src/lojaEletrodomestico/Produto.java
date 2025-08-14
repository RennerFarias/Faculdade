package lojaEletrodomestico;

public class Produto {
	
	private String codigo;
	private String nome;
	private double preco;
	private int qntEstoque;
	
	public Produto(String codigo, String nome, double preco, int qntEstoque) {
		this.codigo = codigo;
		this.nome = nome;
		this.preco = preco;
		this.qntEstoque = qntEstoque;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQntEstoque() {
		return qntEstoque;
	}

	public void setQntEstoque(int qntEstoque) {
		this.qntEstoque = qntEstoque;
	}

	@Override
	public String toString() {
		return "Produto [codigo=" + codigo + ", nome=" + nome + ", preco=" + preco + ", qntEstoque=" + qntEstoque + "]";
	}
}
