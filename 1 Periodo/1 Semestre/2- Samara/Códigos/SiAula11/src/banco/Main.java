package banco;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Cliente cliente1 = new Cliente("João", "111", "rua a");
		Cliente cliente2 = new Cliente("João", "1d1", "rua a");
		
		if (cliente1.equals(cliente2)) {
			System.out.println("Clientes iguais");
		}else {
			System.out.println("Clientes diferentes");
		}
		
		
//		Gerente gerente = new Gerente();
//		
//		int opcao;
//	
//		
//		do {
//			System.out.println("Temos as seguintes opções: ");
//			System.out.println("1- Adicionar conta");
//			System.out.println("2- Remover conta");
//			System.out.println("3- Listar contas");
//			System.out.println("4- Realizar saque");
//			System.out.println("5- Realizar deposito");
//			System.out.println("7- Recuperar uma conta ");
//			System.out.println("6- Sair");
//			System.out.println("8- Exibir clientes");
//			System.out.println("Digite a operação que você quer realizar: ");
//			
//			opcao = scanner.nextInt();
//			scanner.nextLine();
//			
//			switch (opcao) {
//			case 1:
//				Cliente cliente = gerente.criarCliente(scanner);
//				gerente.criarConta(cliente);
//				break;
//			case 2:
//				gerente.removerConta(scanner);
//				break;
//			case 3:
//				gerente.listarContas();
//				break;
//			case 4:
//				gerente.realizarSaque(scanner);
//				break;
//			case 5:
//				gerente.realizarDeposito(scanner);
//				break;
//			case 8:
//				gerente.exibirClientes();
//				break;
//			default:
//				break;
//			}
//			
//		}while(opcao != 6);
//		System.out.println("Saindo do sistema ...");
	}

}
