package aula5;

public class Repeticao {
	
	public static void main(String[] args) {
		
		int[] numeros = {2,3,4,5,8,10};
		String[] frutas = {"pera", "maça", "banana"};
		int contador = 0;
			
		for(String fruta:frutas) {
			if(fruta.equals("banana")) {
				System.out.println("Encontrou");
				System.out.println("Posição: " + contador);
				return;
			}
			System.out.println(contador);
			contador ++;
		}
		
	}

}
