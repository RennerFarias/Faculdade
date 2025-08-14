package heranca;

public class Pessoa {
	
	String nome;
	int idade;
	String matricula;
	String endereco;
	String cpf;
	String turno;
	
	public Pessoa(String nome, int idade, String matricula, String endereco, String cpf, String turno) {
		this.nome = nome;
		this.idade = idade;
		this.matricula = matricula;
		this.endereco = endereco;
		this.cpf = cpf;
		this.turno = turno;
	}
	
	public void passarCatraca() {
		System.out.println("passei");
	}
	
	

}
