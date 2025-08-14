package questao1;

public class Gerente extends Funcionario{

	String Departamento;

	public Gerente(String nome, double salario, String departamento) {
		super(nome, salario);
		Departamento = departamento;
	}
	
	public void exibirNome() {
		System.out.println(super.nome);
	}
}
