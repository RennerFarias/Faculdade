package aula5;

import java.util.Scanner;

public class AtividadeForEach {
	
	public static void main(String[] args) {
		
		//Questão 1
//		int[] numeros = {10, 20, 30, 40, 50};
//		
//		for(int num: numeros) {
//			System.out.println(num);
//		}
		
		//Questão 2 
		
//		String[] palavras =  {"casa", "carro", "avião", "ônibus", "barco"};
//		
//		int contador = 0;
//		for(String palavra: palavras) {
//			if(palavra.length() > 4) {
//				contador += 1;
//			}
//		}
//		
//		System.out.println(contador + " palavras têm mais de 4 letras");
		
		//Questão 3
		System.out.println(procuraNumero());
		
	}

	public static String procuraNumero() {
		// Questão 3

		Scanner scan = new Scanner(System.in);
		int[] numeros = { 3, 7, 11, 18, 25 };

		System.out.print("Digite o número que você tá procurando: ");
		int numeroProcurado = scan.nextInt();

		for (int num : numeros) {
			if (num == numeroProcurado) {
				return "Número encontrado";
			}
		}
		return "Número não encontrado";
	}

}
