package transporteEscolar;

import java.util.Scanner;

import lojaEletrodomestico.Produto;

public class Motorista {
	
	private Onibus onibus;
	
	public Motorista() {
		this.onibus = new Onibus();
	}
	
	public void cadastrarAluno(Scanner scanner) {

		System.out.println("Digite a matrícula do aluno que você quer cadastrar");
		String matricula = scanner.nextLine();


		for (Aluno aluno : onibus.getAlunos()) {
			if (aluno.getMatricula().equals(matricula)) {
				System.out.println("ALuno já cadastrado");
				return;
			}
		}

		System.out.println("Digite o nome do aluno que você quer cadastrar");
		String nome = scanner.nextLine();

		System.out.println("Digite o endereço do aluno que você quer cadastrar");
		String endereco = scanner.nextLine();
		
		Aluno aluno = new Aluno(nome, matricula, endereco);

		onibus.getAlunos().add(aluno);
		System.out.println("Aluno cadastrado");
	}

}
