package metodos;

import java.util.Scanner;

public class RespostaAna {

	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.println("Escolha uma opção:");
	        System.out.println("1 - Verificar par/ímpar");
	        System.out.println("2 - Comparar dois números");
	        System.out.println("3 - Verificar aprovação simples");
	        System.out.println("4 - Verificar situação acadêmica com bolsa");
	        System.out.print("Opção: ");
	        int opcao = scanner.nextInt();
	        
	        if (opcao == 1) {
	            verificarParImpar(scanner);
	        } 
	        else if (opcao == 2) {
	            compararNumeros(scanner);
	        } 
	        else if (opcao == 3) {
	            verificarAprovacaoSimples(scanner);
	        } 
	        else if (opcao == 4) {
	            verificarSituacaoAcademica(scanner);
	        } 
	        else {
	            System.out.println("Opção inválida!");
	        }
	        
	        scanner.close();
	    }
	    
	    public static void verificarParImpar(Scanner scanner) {
	        System.out.print("Digite um número: ");
	        int numero = scanner.nextInt();
	        
	        if (numero % 2 == 0) {
	            System.out.println("O número é par.");
	        } else {
	            System.out.println("O número é ímpar.");
	        }
	    }
	    
	    public static void compararNumeros(Scanner scanner) {
	        System.out.print("Digite o primeiro número: ");
	        int num1 = scanner.nextInt();
	        System.out.print("Digite o segundo número: ");
	        int num2 = scanner.nextInt();
	        
	        if (num1 > num2) {
	            System.out.println("O maior número é " + num1);
	        } else if (num2 > num1) {
	            System.out.println("O maior número é " + num2);
	        } else {
	            System.out.println("Os números são iguais");
	        }
	    }
	    
	    public static void verificarAprovacaoSimples(Scanner scanner) {
	        System.out.print("Digite sua média final: ");
	        double media = scanner.nextDouble();
	        
	        if (media >= 60) {
	            System.out.println("Aprovado");
	        } else {
	            System.out.println("Reprovado");
	        }
	    }
	    
	    public static void verificarSituacaoAcademica(Scanner scanner) {
	        System.out.print("Digite o valor da média final: ");
	        double media = scanner.nextDouble();
	        scanner.nextLine();
	        System.out.print("O aluno é bolsista? (sim ou não): ");
	        String bolsista = scanner.nextLine().toLowerCase();
	        
	        if (bolsista.equals("sim")) {
	            if (media >= 70) {
	                System.out.println("Aprovado com bolsa mantida");
	            } else {
	                System.out.println("Reprovado e bolsa cancelada");
	            }
	        } else {
	            if (media >= 60) {
	                System.out.println("Aprovado");
	            } else {
	                System.out.println("Reprovado");
	            }
	        }
	    }
}