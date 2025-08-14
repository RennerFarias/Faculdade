package code;

import java.util.Scanner;

public class EstruturaRepeticao {
	
	public static void main(String[] args) {
		
		// Questão 2
//		int soma = 0;
//		for(int i = 1; i <= 10; i++) {
//			soma += i;
//		}
//		System.out.println(soma);
		
		//Questão 3
//		
//		int[] numeros = {2,8,5,9};
//		
//		for(int i = 0 ; i < numeros.length; i++) {
//			System.out.println(numeros[i]);
//			
//		}
		
		// Questao 4
//		for(int i = 5; i>= 1; i--) {
//			System.out.println(i);
//		}
		
		//Questão 5
//		for(int i = 1; i<=10; i++) {
//			int multiplicacao = 3 * i;
//
//			System.out.println("3 X " + i + " = " + multiplicacao);
//		}
		//Questao 6
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Digite um número: ");
//		int numero = scan.nextInt();
//		
//		int resultado = 1;
//		for(int i = numero; i >=1; i--) {
//			resultado *= i;
//		}
//		System.out.println("O resultado é: " + resultado);
		
		//FOREACH
		
		
		String[] palavras = {"casa", "comida", "roupa"};
		
		int contador = 0;
		for(String elemento: palavras) {
			
			if(elemento.equals("roupa")) {
				System.out.println(contador);
			}
			contador +=1;
			
			
		}
		
		
	}
}

