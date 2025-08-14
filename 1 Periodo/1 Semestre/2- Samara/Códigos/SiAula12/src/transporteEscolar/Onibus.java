package transporteEscolar;

import java.util.ArrayList;

public class Onibus {
	
	private ArrayList<Aluno> alunos;

	public Onibus() {
		this.alunos = new ArrayList<Aluno>();
	}

	public ArrayList<Aluno> getAlunos() {
		return alunos;
	}

	public void setAlunos(ArrayList<Aluno> alunos) {
		this.alunos = alunos;
	}
}
