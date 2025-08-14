package lojaEletrodomestico;

import java.util.Scanner;

public class Funcionario {
	
	Loja loja;
	
	public Funcionario() {
		this.loja = new Loja();
	}	
	
	public void cadastrarProduto(Scanner scanner) {
		
		System.out.println("Digite o código do produto que você quer cadastrar");
		String codigo = scanner.nextLine();
		
		int quantidade;
		
		for(Produto produto: loja.getProdutos()) {
			if(produto.getCodigo().equals(codigo)) {
				System.out.println("Digite a quantidade do produto que você quer cadastrar");
				 quantidade = scanner.nextInt();
				
				produto.setQntEstoque(produto.getQntEstoque() + quantidade);
				return;
			}
		}
		
		System.out.println("Digite o preço do produto que você quer cadastrar");
		double preco = scanner.nextDouble();
		
		System.out.println("Digite a quantidade do produto que você quer cadastrar");
		quantidade = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("Digite o nome do produto que você quer cadastrar");
		String nome = scanner.nextLine();
		
		Produto novoProduto = new Produto(codigo, nome, preco, quantidade);
		
		loja.getProdutos().add(novoProduto);
		System.out.println("Produto cadastrado");
	}
	
	public void exibirProdutos() {
		loja.exibirProdutos();
	}
	
	public Produto buscarProduto(Scanner scanner) {
		System.out.println("Digite o código do produto que você quer procurar");
		String codigo = scanner.nextLine();
		for(Produto produto: loja.getProdutos()) {
			if(produto.getCodigo().equals(codigo)) {
				return produto;
			}
		}
		return null;
	}
	
	public void verificarEstoque(Scanner scanner) {
		boolean encontrado = false;
		
		System.out.println("Digite o código do produto que você quer procurar");
		String codigo = scanner.nextLine();
		
		for (Produto produto: loja.getProdutos()) {
			if(produto.getCodigo().equals(codigo)) {
				encontrado = true;
				if(produto.getQntEstoque()>0) {
					System.out.println("Produto encontrado e possui quantidade em estoque");
				}else {
					System.out.println("Produto encontrado e NÃo possui quantidade em estoque");
				}
			}
		}
		
		if(!encontrado) {
			System.out.println("Produto nao encontrado");
		}
	}
	
}
