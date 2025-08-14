package listas;

public class Atividade3 {

	public static void main(String[] args) {
		
		int[] numeros = {3, 6, 9, 12, 15};
		
		//soma do primeiro e do último elemento
		
		int soma = numeros[0] + numeros[numeros.length -1];
		
		System.out.println(numeros[numeros.length -2]);
		
		System.out.println("A soma é: " + soma);
		System.out.println("A soma é: " + (numeros[0] + numeros[4]));
	}
}
