package banco;

public class Operacoes {
	
	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente("Samara", "Esperança", "000.000.000-00");
		
		System.out.println(cliente1.getNome());
		cliente1.setNome("Samara Sampaio");
		System.out.println(cliente1.getNome());
		
		System.out.println(cliente1);
	}

}
