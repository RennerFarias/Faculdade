package condicionais;

import java.util.Scanner;

public class Atividade4 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe a média");
		double media = sc.nextDouble();
		sc.nextLine();
		
		System.out.println("Informe se é bolsista: (sim/não)");
		String bolsista = sc.nextLine();
		//bolsista = bolsista.toLowerCase();
		
		if(bolsista.equalsIgnoreCase("sim")) {
			System.out.println("oi");
			if(media >= 70) {
				System.out.println("Aprovado com bolsa mantida!");
			}
			else {
				System.out.println("Reprovado com bolsa cancelada.");
			}
		}else {
			System.out.println("olá");
			if(media >= 70) {
				System.out.println("Aprovado!");
			}else {
				System.out.println("Reprovado!");
			}
		}

		
	}

}
