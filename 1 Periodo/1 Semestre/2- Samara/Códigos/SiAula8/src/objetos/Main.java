package objetos;

public class Main {
	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno("João" ,15, "0021");
		Aluno aluno2 = new Aluno("Maria" ,15, "002f");
		Aluno aluno3 = new Aluno("Tereza" ,15, "0sf1");
		Aluno aluno4 = new Aluno("Jonas" ,15, "002fds");
		
		Turma turmaPoo = new Turma("Programação Orientada a Objetos básica");
		
		turmaPoo.addAluno(aluno1);
		turmaPoo.addAluno(aluno2);
		turmaPoo.addAluno(aluno3);
		turmaPoo.addAluno(aluno4);
		
		
		turmaPoo.exibirAlunos();
	}

}
