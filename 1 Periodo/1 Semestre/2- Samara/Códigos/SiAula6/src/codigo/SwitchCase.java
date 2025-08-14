package codigo;

import java.util.Scanner;

public class SwitchCase {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String opcao = "";
	
		while(!opcao.equalsIgnoreCase("sair")) {
			
			System.out.println("________________________________________");
			System.out.println("Se quiser resolver a questão 1, digite 1");
			System.out.println("Se quiser resolver a questão 2, digite 2");
			System.out.println("Se quiser resolver a questão 3, digite 3");
			System.out.println("Para sair do sistema, digite sair");
			System.out.println("________________________________________");
			
			opcao = scanner.nextLine();
			
			switch (opcao) {
			case "1":
				System.out.println("Resolva a questão 1");
				 Questao1.executar(scanner); 
				break;
			case "2":
				System.out.println("Resolva a questão 2");
				break;
			case "3":
				System.out.println("Resolva a questão 3");
				break;
			default:
				if(!opcao.equalsIgnoreCase("sair")) {
					System.out.println("Opção inválida");					
				}
			}
		}
		
		System.out.println("Saindo do sistema");
	}
}
