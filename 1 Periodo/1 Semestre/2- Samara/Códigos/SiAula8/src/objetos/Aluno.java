package objetos;

public class Aluno {
	
	String nome;
	int idade;
	String matricula;
	
	public Aluno(String nome, int idade, String matricula) {
		this.nome = nome;
		this.idade = idade;
		this.matricula = matricula;
	}

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", idade=" + idade + ", matricula=" + matricula + "]";
	}
	
	
	
	
	

	
	

}
