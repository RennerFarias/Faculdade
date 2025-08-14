package metodos;

import java.util.Scanner;

public class Metodos {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int resultado = somar(scan);
		System.out.println(resultado);
		
		scan.close();
	}
	
	public static int somar(Scanner scan) {
				
		System.out.println("Digite o número 1");
		int numero1 = scan.nextInt();
		
		System.out.println("Digite o número 2");
		int numero2 = scan.nextInt();
		int soma = numero1 + numero2;
		
		return soma;
		
		
	}

}
