package codigo;

import java.util.ArrayList;
import java.util.Scanner;

public class Questao1 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		ArrayList<String> listaCompras = new ArrayList<String>();
		
		int opcao = 0;
		
		while(opcao != 5) {
			System.out.println("___________________");
			System.out.println("1 - Adicionar");
			System.out.println("2 - Remover");
			System.out.println("3 - Exibir Lista");
			System.out.println("4 - Limpar");
			System.out.println("5 - Sair");
			
			System.out.println("Digite a opção:");
			opcao = scanner.nextInt();
			scanner.nextLine();
			
			System.out.println("___________________");
			
			switch(opcao) {
			case 1:
				FuncionalidadesListaCompras.adicionar(scanner, listaCompras);
				break;
			case 2:
				FuncionalidadesListaCompras.remover(scanner, listaCompras);
				break;
			case 3: 
				FuncionalidadesListaCompras.exibir(listaCompras);
				break;
			case 4 :
				FuncionalidadesListaCompras.limpar(listaCompras);
				break;
			case 5:
				System.out.println("Saindo do Sistema");
				break;
			default:
				System.out.println("Opção Inválida");
			}
		}
	}
}
