package heranca;

public class Main {

	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa("Samara", 28, "54d", "Esperança", "111", "Manhã");
		
		//pessoa.passarCatraca();
		
		
		Aluno aluno = new Aluno("Samara", 28, "54d", "Esperança", "111", "Manhã", "Sistemas");
		
		Colaborador colaborador = new Colaborador("Samara", 28, "54d", "Esperança", "111", "Manhã", "ensino");

		aluno.passarCatraca();
		colaborador.passarCatraca();
	}

}
