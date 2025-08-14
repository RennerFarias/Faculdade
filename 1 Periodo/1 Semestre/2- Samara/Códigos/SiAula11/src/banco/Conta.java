package banco;

import java.util.Scanner;

public class Conta {
	
	private int numero;
	private double saldo;
	private Cliente cliente;
	
	public Conta(int numero, double saldo, Cliente cliente) {
		this.numero = numero;
		this.saldo = saldo;
		this.cliente = cliente;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public Cliente getCliente() {
		return cliente;
	}
	
	public void sacar(Scanner scanner) {
		System.out.println("Digite o valor que você quer sacar: ");
		double valor = scanner.nextDouble();
		this.saldo -= valor;
		System.out.println("O novo saldo é R$ " + this.saldo);
	}
	
	public void depositar(Scanner scanner) {
		System.out.println("Digite o valor que você quer depositar: ");
		double valor = scanner.nextDouble();
		this.saldo += valor;
		System.out.println("O novo saldo é R$ " + this.saldo);
	}

	@Override
	public String toString() {
		return "Conta [numero=" + numero + ", saldo=" + saldo + ", cliente=" + cliente + "]";
	}
	
	

}
