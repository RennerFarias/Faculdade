package codigo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FuncionalidadesEstoque {
	
	public static void adicionar(Scanner scan, HashMap<String, Integer> estoque) {
		System.out.println("Digite o produto que você quer adicionar: ");
		String nomeProduto = scan.nextLine();
		
		System.out.println("Digite a quantidade de produtos: ");
		int quantidade = scan.nextInt();
		
		estoque.put(nomeProduto, quantidade);
		System.out.println("Produto adicionado");
	}
	
	
	public static void listar(HashMap<String, Integer> estoque) {
		
		for (Map.Entry<String, Integer> produto : estoque.entrySet()) {

           System.out.println("Produto: " + produto.getKey() + " - "
                              + produto.getValue() + " unidades");
       }
		
	}
	
	public static void remover(Scanner scan, HashMap<String, Integer> estoque) {
		System.out.println("Digite o produto que você quer remover: ");
		String nomeProduto = scan.nextLine();
		
		estoque.remove(nomeProduto);
		System.out.println("Produto removido");
	}
	
	public static void atualizar(Scanner scan, HashMap<String, Integer> estoque) {
		System.out.println("Digite o produto que você quer atualizar: ");
		String nomeProduto = scan.nextLine();
		
		System.out.println("Digite a quantidade que você quer acrescentar ou descrescentar: ");
		int quantidade = scan.nextInt();
		
		int novaQuantidade= 0;
		for (Map.Entry<String, Integer> produto : estoque.entrySet()) {
			
			if(produto.getKey().equalsIgnoreCase(nomeProduto)) {
				System.out.println(produto.getValue());
				novaQuantidade = produto.getValue() + quantidade;
			} 
	     }
		estoque.put(nomeProduto, novaQuantidade);
	}

}
