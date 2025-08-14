package aula5;

import java.util.Scanner;

public class RepeticaoDoWhile {
	
	public static void main(String[] args) {
		
		//Questão 1
//		Scanner scan = new Scanner(System.in);
//		int soma = 0;
//		
//		int numero ;
//		
//		do {
//			
//			System.out.println("Digite um número: ");
//			numero = scan.nextInt();
//			
//			if(numero > 0) {
//				soma += numero;
//			}
//			
//		}while(numero > 0);
//		
//		System.out.println("A soma é: "+ soma);
		
		//Questão 2
		
		Scanner scan = new Scanner(System.in);
		int numero;
		do {
			System.out.println("Digite um número: ");
			numero = scan.nextInt();
			
			if(numero != 0) {
				for(int i = 1; i <=10; i++) {
					System.out.println(numero + " X " + i + " = " + (numero*i));
				}
			}
			
		}while(numero != 0);
		
		
	}

}
