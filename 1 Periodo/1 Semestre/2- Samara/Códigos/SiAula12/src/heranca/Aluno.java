package heranca;

public class Aluno extends Pessoa {
	
	private String curso;

	public Aluno(String nome, int idade, String matricula, String endereco, String cpf, String turno, String curso) {
		super(nome, idade, matricula, endereco, cpf, turno);
		this.curso = curso;
	}
	

}
