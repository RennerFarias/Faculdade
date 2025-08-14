package codigo;

import java.util.Scanner;

public class Revisao {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		//Questão 1 com while
//		boolean continuar = true;
//		String entradaUsuario;
//		
//		while (continuar) {
//			System.out.println("Olá Mundo!");
//			System.out.println("Deseja imprimir novamente? (sim/ não)");
//			entradaUsuario = scanner.nextLine();
//
//			if (entradaUsuario.equalsIgnoreCase("sim")) {
//				continuar = true;
//			} else if (entradaUsuario.equalsIgnoreCase("não")) {
//				continuar = false;
//			} else {
//				continuar = false;
//				System.out.println("Entrada inválida");
//			}
//
//		}
		
		//Questão 1 com do while
//		String entradaUsuario;
//		boolean continuar = true;
//		
//		do {
//			System.out.println("Olá Mundo!");
//			
//			System.out.println("Deseja imprimir novamente? (sim/ não)");
//			entradaUsuario = scanner.nextLine();
//			
//			if (entradaUsuario.equalsIgnoreCase("sim")) {
//				continuar = true;
//			} else if (entradaUsuario.equalsIgnoreCase("não")) {
//				continuar = false;
//			} else {
//				continuar = false;
//				System.out.println("Entrada inválida");
//			}
//			
//		}while(continuar);
		
		//Questão 2
//		String continuar;
//		int multiplicacao = 0;
//		int soma = 0;
//		do{
//			
//			System.out.println("Digite um número: ");
//			int numero = scanner.nextInt();
//			scanner.nextLine();
//			soma += numero * 2;
//			//soma += multiplicacao; // => soma = soma + multiplicação
//			System.out.println("Deseja continuar?");
//			continuar = scanner.nextLine();
//			
//		}while(continuar.equals("sim"));
//		
//		System.out.println("A multiplicação de todos os números foi: " + multiplicacao);
//		
		
		// Questão 3
//		
//		String resposta;
//		do {
//			System.out.println("Digite um nome: ");
//			String nome = scanner.nextLine();
//			System.out.println(nome);
//			
//			System.out.println("Quer digitar outro nome");
//			resposta = scanner.nextLine();
//		}while(resposta.equals("sim"));
		
		// Questao 4
//		
//		int numero;
//		do {
//			
//			System.out.println("Digite um número:");
//			numero = scanner.nextInt();
//			
//			for (int i = 1; i <= numero; i++) {
//				System.out.println(i);
//			}
//			
//		}while(numero > 0);
		
		System.out.println("Digite um número:");
		int numero = scanner.nextInt();
		
		while(numero > 0) {
			for (int i = 1; i <= numero; i++) {
				System.out.println(i);
			}
			
			System.out.println("Digite um número:");
			numero = scanner.nextInt();
		}
	}

}
