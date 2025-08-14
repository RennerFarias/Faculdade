package questao2;

public class Carro extends Transporte {
	
	private String tipoCombustivel;

	public Carro(int capacidade, double velocidade, String tipoCombustivel) {
		super(capacidade, velocidade);
		this.tipoCombustivel = tipoCombustivel;
	}

	public String getTipoCombustivel() {
		return tipoCombustivel;
	}

	public void setTipoCombustivel(String tipoCombustivel) {
		this.tipoCombustivel = tipoCombustivel;
	}

	@Override
	public String toString() {
		return "A capacidade do carro: " + super.getCapacidade()
				+ "Carro [tipoCombustivel=" + this.tipoCombustivel + "]";
	}

	@Override
	public void mostrarDetalhes() {
		System.out.println("Mostrando detalhes na classe carro");	
	}

}
