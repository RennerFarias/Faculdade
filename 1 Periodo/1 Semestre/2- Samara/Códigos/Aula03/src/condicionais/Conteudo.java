package condicionais;

public class Conteudo {

	public static void main(String[] args) {

		boolean aprovado = false;
		int nota = 4;

		if (nota < 4) {
			System.out.println("Reprovado!");
		} else if (nota >= 4 & nota < 7) {
			System.out.println("Fazer final");
		} else {
			System.out.println("Aprovado!");
		}
	}
}
