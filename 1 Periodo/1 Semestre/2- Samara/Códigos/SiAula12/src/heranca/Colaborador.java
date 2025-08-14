package heranca;

public class Colaborador extends Pessoa {

	private String setor;

	public Colaborador(String nome, int idade, String matricula, String endereco, String cpf, String turno,
			String setor) {
		super(nome, idade, matricula, endereco, cpf, turno);
		this.setor = setor;
	}
	
	public void passarCatraca() {
		System.out.println("passei e batir o ponto");
	}

}
