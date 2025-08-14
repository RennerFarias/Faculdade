package codigo;

import java.util.ArrayList;

public class EstruturaDeDados {
	
	public static void main(String[] args) {
		
		ArrayList<String> minhaLista = new ArrayList<>();
		
		minhaLista.addLast("escola");
		minhaLista.add("casa");
		minhaLista.add("faculdade");
		minhaLista.addFirst("sitio");
		
		for(String elemento: minhaLista) {
			System.out.println(elemento);
	}
		
		//System.out.println(minhaLista.size());
		
		System.out.println(minhaLista.indexOf("casa"));

//		for(String elemento: minhaLista) {
//			System.out.println(elemento);
//		}
		//System.out.println(minhaLista.size());
	}
}
