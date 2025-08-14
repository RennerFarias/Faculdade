package condicionais;

import java.util.Scanner;

public class Atividade2 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um inteiro: ");
		int numero1 = sc.nextInt();
		
		System.out.println("Digite um inteiro: ");
		int numero2 = sc.nextInt();
		
		if(numero1 > numero2) {
			System.out.println("Número 1 é maior");
		}else {
			System.out.println("Número 2 é maior");
		}
	}

}
