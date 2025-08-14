package codigo;

import java.util.HashSet;
import java.util.Set;

public class EstruturaSet {
	
	public static void main(String[] args) {
		Set<String> nomes = new HashSet<String>();
		
		nomes.add("Samara");
		nomes.add("Jonas");
		nomes.add("Samara");
		
		System.out.println(nomes);
	}

}
