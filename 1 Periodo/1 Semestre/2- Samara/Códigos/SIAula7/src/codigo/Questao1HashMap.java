package codigo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Questao1HashMap {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		HashMap<String, Integer> estoque = new HashMap<String, Integer>();
		int opcao = 0;
		
		while(opcao != 5) {
			System.out.println("___________________");
			System.out.println("1 - Adicionar");
			System.out.println("2 - Remover");
			System.out.println("3 - Atualizar");
			System.out.println("4 - Listar");
			System.out.println("5 - Sair");
			
			System.out.println("___________________");
			System.out.println("Digite a opção:");
			opcao = scanner.nextInt();
			scanner.nextLine();
			
			System.out.println("___________________");
			
			switch(opcao) {
			case 1:
				FuncionalidadesEstoque.adicionar(scanner, estoque);
				break;
			case 2:
				FuncionalidadesEstoque.remover(scanner, estoque);
				break;
			case 3: 
				FuncionalidadesEstoque.atualizar(scanner, estoque);
				break;
			case 4 :
				FuncionalidadesEstoque.listar(estoque);;
				break;
			case 5:
				System.out.println("Saindo do Sistema");
				break;
			default:
				System.out.println("Opção Inválida");
			}
		}
	}
}