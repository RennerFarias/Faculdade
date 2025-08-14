package objetos;

import java.util.ArrayList;

public class Turma {
	
	String nome;
	ArrayList<Aluno> alunos;
	
	public Turma(String nome) {
		this.nome = nome;
		this.alunos = new ArrayList<Aluno>();
	}
	
	public void addAluno(Aluno aluno) {
		this.alunos.add(aluno);
	}
	
	public void exibirAlunos() {
		for (Aluno aluno : alunos) {
			System.out.println(aluno.nome);
		}
	}

}
