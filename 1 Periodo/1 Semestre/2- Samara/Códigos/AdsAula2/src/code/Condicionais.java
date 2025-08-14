package code;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Condicionais {
	
	public static void main(String[] args) {
		
		// Questão 1
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Digite um número: ");
//		int numero = scanner.nextInt();
//		
//		if(numero % 2 == 0) {
//			System.out.println("Número par");
//		}
//		else {
//			System.out.println("número impar");
//		}
//		
		//Questão 2
		
		Scanner scanner = new Scanner(System.in);
//		System.out.println("Digite um Numero 1: ");
//		int numero1 = scanner.nextInt();
//		
//		System.out.println("Digite um Numero 2: ");
//		int numero2 = scanner.nextInt();
//
//		if(numero1 > numero2) {
//			System.out.println("Número 1 é maior");
//		}else {
//			System.out.println("Número 2 é maior");
//		}
		
		//Questão 3
//		System.out.println("Digite uma nota: ");
//		double nota = scanner.nextDouble();
//		
//		if(nota >=60) {
//			System.out.println("Aprovado");
//		}
//		else {
//			System.out.println("Reprovado");
//		}
		
		// QUESTOES ELSE IF
		//QUESTÃO1
		
//		System.out.println("Digite o valor da compra: ");
//		double valor = scanner.nextDouble();
//		double valorFinal;
//		
//		if(valor >= 1000) {
//			valorFinal = valor * 0.8;
//			System.out.println("O valor final é R$ " + valorFinal );
//		}else if( valor >= 500 && valor < 1000) {
//			valorFinal = valor * 0.9;
//			System.out.println("O valor final é R$ " + valorFinal );
//		}else if( valor >= 100 && valor < 500) {
//			valorFinal = valor * 0.95;
//			System.out.println("O valor final é R$ " + valorFinal );
//		}else {
//			valorFinal = valor;
//			System.out.println("O valor final é R$ " + valorFinal );
//		}
		
		//Questão 2
		
		int variavel = Integer.parseInt(JOptionPane.showInputDialog("Digite a temperatura atual: "));
		
		
//		int temp = Integer.parseInt(JOptionPane.showInputDialog("Digite a temperatura atual: "));
//		if (temp >= 40) {
//			JOptionPane.showMessageDialog(null, "Extremamente quente");
//		} else if (temp < 40 && temp >= 30) {
//			JOptionPane.showMessageDialog(null, "Quente");
//		} else if (temp < 30 && temp >= 20) {
//			JOptionPane.showMessageDialog(null, "Agradável");
//		} else if (temp < 20 && temp >= 10) {
//			JOptionPane.showMessageDialog(null, "Frio");
//		} else if (temp < 10) {
//			JOptionPane.showMessageDialog(null, "Muito frio");
//		}
//		
		
		//Questão 2 com Scanner
		
//		System.out.println("Digite a temperatura: ");
//		double temperatura = scanner.nextDouble();
//		
//		if(temperatura >= 40) {
//			System.out.println("Extremamente quente " + temperatura);
//		}else if(temperatura >= 30 && temperatura < 39) {
//			System.out.println("Quente" + temperatura);
//		}else if(temperatura >= 20 && temperatura < 30) {
//			System.out.println("Agradável " + temperatura);
//		}else if(temperatura >= 10 && temperatura < 20) {
//			System.out.println("Quente " + temperatura);
//		}else {
//			System.out.println("Muito Frio");
//		}
		
	}

}
