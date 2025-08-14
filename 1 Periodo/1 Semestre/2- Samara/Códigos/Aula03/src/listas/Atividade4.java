package listas;

public class Atividade4 {
	
	public static void main(String[] args) {
		
		int[] numeros = {3, 6, 9, 12, 15};
		
		//diferença entre segundo e terceiro
		
		int segundo = numeros[1];
		int terceiro = numeros[2];
		
		int diferenca = segundo - terceiro;
		
		System.out.println("A diferença é: " + diferenca);
		System.out.println("A diferença absoluta é: " + Math.abs(diferenca));
	}

}
