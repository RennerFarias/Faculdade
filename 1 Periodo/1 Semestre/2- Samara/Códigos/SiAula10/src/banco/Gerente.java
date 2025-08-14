package banco;

import java.util.ArrayList;
import java.util.Scanner;

public class Gerente {
	
	ArrayList<Conta> contas;

	public Gerente() {
		this.contas = new ArrayList<Conta>();
	}
	
	public Cliente criarCliente(Scanner scanner) {

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
	

	public void criarConta(Cliente cliente) {
		int contaNumero;
		
		if(this.contas.size() == 0) {
			contaNumero = 1000;
		}else {
			contaNumero = this.contas.getLast().getNumero() + 1;
		}

		Conta novaConta = new Conta(contaNumero, 0, cliente);
		this.contas.add(novaConta);
		System.out.println("O número da conta é: " + contaNumero);
		
	}

	public void listarContas() {
		for (Conta conta : contas) {
			System.out.println(conta);
		}
	}
	
	public void removerConta(Scanner scanner) {
		System.out.println("Digite o número da conta que você quer remover:");
		int numeroConta = scanner.nextInt();

		for (Conta conta : contas) {
			if (conta.getNumero() == numeroConta) {
				contas.remove(conta);
				System.out.println("Conta removida com sucesso!");
			}
		}
	}
	
	public void realizarSaque(Scanner scanner) {
		System.out.println("Digite o número da conta:");
		int numeroConta = scanner.nextInt();
		for (Conta conta : contas) {
			if (conta.getNumero() == numeroConta) {
				conta.sacar(scanner);
			}
		}
	}
	
	public void realizarDeposito(Scanner scanner) {
		System.out.println("Digite o número da conta:");
		int numeroConta = scanner.nextInt();
		for (Conta conta : contas) {
			if (conta.getNumero() == numeroConta) {
				conta.depositar(scanner);
			}
		}
	}
	
	public void recuperConta(Scanner scanner) {
		System.out.println("Digite o número da conta:");
		int numeroConta = scanner.nextInt();
		String nome = "Samara";
		for (Conta conta : contas) {
			if (conta.getCliente().getNome().equals(nome)) {
				conta.toString();
			}

		}
	}
}
