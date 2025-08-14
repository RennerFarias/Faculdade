package condicionais;

import java.util.Scanner;

public class Atividade1 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite um número:");
		int numero = scanner.nextInt();
		scanner.nextLine();
		
		if(numero % 2 == 0) {
			System.out.println("Número par");
		}else {
			System.out.println("Número impar");
		}
	}

}
