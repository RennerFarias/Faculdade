package codigo;

import java.util.ArrayList;
import java.util.Scanner;

public class FuncionalidadesListaCompras {
	
	public static void adicionar(Scanner scan, ArrayList<String> lista) {
		System.out.println("Digite o produto que você quer adicionar: ");
		String produto = scan.nextLine();
		if(lista.contains(produto)) {
			System.out.println("Produto já tinha sido adicionado anteriormente.");
		}else {
			lista.add(produto);			
		}
		System.out.println("Produto adicionado");
	}
	
	static void remover(Scanner scan, ArrayList<String> lista) {
		System.out.println("Digite o produto que você quer remover: ");
		String produto = scan.nextLine();
		if(lista.contains(produto)) {
			lista.remove(produto);			
		}else {
			System.out.println("O produto não está cadastrado.");
		}
		System.out.println("Produto removido");
	}
	
	static void exibir(ArrayList<String> lista) {
		for(String produto: lista) {
			System.out.println(produto);
		}
	}
	
	static void limpar(ArrayList<String> lista) {
		lista.clear();
		System.out.println("A lista foi limpa");
	}

}
