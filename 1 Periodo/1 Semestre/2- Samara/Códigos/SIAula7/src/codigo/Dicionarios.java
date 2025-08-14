package codigo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Dicionarios {
	
	public static void main(String[] args) {
		
		HashMap<String, String> agendaTelefonica = new HashMap<String, String>();
		
		agendaTelefonica.put("Samara", "9999999999");
		agendaTelefonica.put("Samara", "888888888");
			
		for (Map.Entry<String, String> contato :
			agendaTelefonica.entrySet()) {

           // Printing all elements of a Map
           System.out.println(contato.getKey() + " = "
                              + contato.getValue());
       }
		
	}

}
