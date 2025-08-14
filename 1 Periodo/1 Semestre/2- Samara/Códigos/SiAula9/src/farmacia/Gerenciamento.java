package farmacia;

import java.util.ArrayList;
import java.util.HashMap;

public class Gerenciamento {
	
	public static void main(String[] args) {
		
		ArrayList<Produto> produtos = new ArrayList<Produto>();
		HashMap<String, Produto> produtosHashMap = new HashMap<String, Produto>();
		
		Produto produto1 = new Produto("Dorflex", "00-12", 5.98, "04/08/2026", 5);
		Produto produto2 = new Produto("Dipirona", "00-11", 2, "04/08/2025", 3);
		Produto produto3 = new Produto("Doralgina", "00-11", 2, "04/08/2025", 3);

//		produtos.add(produto1);
//		produtos.add(produto2);
		
//		for (Produto produto : produtos) {
//			if(produto.equals(produto3))
//				System.out.println(produto.getNome());
//		}
		
		
		produtosHashMap.put(produto1.getNome(), produto1);
		produtosHashMap.put(produto2.getNome(), produto2);
		
		for (Produto produto : produtosHashMap.values()) {
			System.out.println(produto);
		}
		
	}

}
