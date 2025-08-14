package lojaEletrodomestico;

import java.util.ArrayList;

public class Loja {
	
	private ArrayList<Produto> produtos;

	public Loja() {
		this.produtos = new ArrayList<Produto>();
	}

	public ArrayList<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(ArrayList<Produto> produtos) {
		this.produtos = produtos;
	}
	
	public void exibirProdutos() {
		for(Produto produto: this.produtos) {
			System.out.println(produto);
		}
	}
	
	
}
