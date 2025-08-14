package banco;

import java.util.ArrayList;
import java.util.Scanner;

public class Gerenciamento {
	
	static int contaNumero = 1000;
	static ArrayList<Conta> contas = new ArrayList<Conta>();
	
	public static void criarConta(Cliente cliente) {
		
		Conta novaConta = new Conta(contaNumero, 0, cliente);
		contas.add(novaConta);
		System.out.println("O número da conta é: " + contaNumero);
		contaNumero +=1;
	}
	
	public static Cliente criarCliente(Scanner scanner) {
		
		System.out.println("Primeiro será necessário cadastrar um cliente.");
		System.out.println("Digite seu nome: ");
		String nome = scanner.nextLine();
		
		System.out.println("Digite seu cpf: ");
		String cpf = scanner.nextLine();
		
		System.out.println("Digite seu endereço: ");
		String endereço = scanner.nextLine();
		
		Cliente cliente = new Cliente(nome, cpf, endereço);
		
		return cliente;
		
	}
	
	public static void listarContas() {
		for (Conta conta : contas) {
			System.out.println(conta);
		}
	}
	
	public static void removerConta(Scanner scanner) {
		System.out.println("Digite o número da conta que você quer remover:");
		int numeroConta = scanner.nextInt();
		
		for (Conta conta : contas) {
			if(conta.getNumero() == numeroConta) {
				contas.remove(conta);
				System.out.println("Conta removida com sucesso!");
			}	
		}
	}
	
	public static void realizarSaque(Scanner scanner) {
		System.out.println("Digite o número da conta:");
		int numeroConta = scanner.nextInt();
		for (Conta conta : contas) {
			if(conta.getNumero() == numeroConta ) {
				conta.sacar(scanner);
			}
		}
	}
	
	public static void realizarDeposito(Scanner scanner) {
		System.out.println("Digite o número da conta:");
		int numeroConta = scanner.nextInt();
		for (Conta conta : contas) {
			if(conta.getNumero() == numeroConta ) {
				conta.depositar(scanner);
			}
		}
	}
	
	public static void recuperConta(Scanner scanner) {
		System.out.println("Digite o número da conta:");
		int numeroConta = scanner.nextInt();
		String nome = "Samara";
		for (Conta conta : contas) {
			if(conta.getCliente().getNome().equals(nome) ) {
				conta.toString();
			}
			
		}
	}
}

		
		