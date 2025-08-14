package metodos;

public class EstruturaRepeticao {
	
	public static void main(String[] args) {
		 
		// Questao 1
		for(int i = 1; i<=5; i++) {
			//System.out.println(i);
		}
		
		//Questao2
		int soma = 0;
		for(int i = 1; i<=10; i++) {
			soma += i;
		}
		
		//System.out.println(soma);
		
		//Questao 3
		
		int[] numeros = {5,1,6,3,2};
		for(int i = 0; i<= numeros.length -1; i++) {
			//System.out.println(numeros[i]);
		}
		
		//Questão 4
		for(int i = 5; i>=1; i--) {
		//	System.out.println(i);
		}
		
		//Questão 5
		for(int i = 1; i<=10; i++) {
		//	System.out.println(3 + " x " + i + " = " + (3*i));
		}
		
		//Questao 6 
		for(int i = 2; i <= 10; i+=2) {
			System.out.println(i);
		}
	}

}
