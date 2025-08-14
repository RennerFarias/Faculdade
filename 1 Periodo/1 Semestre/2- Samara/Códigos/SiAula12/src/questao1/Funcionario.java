package questao1;

public class Funcionario {
	
	protected String nome;
	protected double salario;
	
	public Funcionario(String nome, double salario) {
		super();
		this.nome = nome;
		this.salario = salario;
	}
	
	public void calcularBonus() {
		System.out.println("Calculando o bônus...");
	}
	
	

}
