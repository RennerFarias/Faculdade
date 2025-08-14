package lojaEletrodomestico;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);	
		
		Funcionario funcionario = new Funcionario();
		
		int opcao;
	
		
		do {
			System.out.println("Temos as seguintes opções: ");
			System.out.println("1- Cadastrar produto");
			System.out.println("2- Listar produtos");
			System.out.println("3- Procurar produto pelo código");
			System.out.println("6- Sair");
			System.out.println("Digite a operação que você quer realizar: ");
			
			opcao = scanner.nextInt();
			scanner.nextLine();
			
			switch (opcao) {
			case 1:
				funcionario.cadastrarProduto(scanner);
				break;
			case 2:
				funcionario.exibirProdutos();
				break;
			case 3:
				Produto produto = funcionario.buscarProduto(scanner);
				if(produto == null) {
					System.out.println("Produto nao cadastrado");
				}else {
					System.out.println(produto);
				}
				break;
//			case 4:
//				gerente.realizarSaque(scanner);
//				break;
//			case 5:
//				gerente.realizarDeposito(scanner);
//				break;
//			case 8:
//				gerente.exibirClientes();
//				break;
			default:
				break;
			}
			
		}while(opcao != 6);
		System.out.println("Saindo do sistema ...");
	}

}

