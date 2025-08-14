package questao2;

import java.util.Objects;

public abstract class Transporte {
	
	private int capacidade;
	private double velocidade;
	
	public Transporte(int capacidade, double velocidade) {
		this.capacidade = capacidade;
		this.velocidade = velocidade;
	}

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

	public double getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(double velocidade) {
		this.velocidade = velocidade;
	}
	
	public abstract void mostrarDetalhes();

	@Override
	public String toString() {
		return "Transporte [capacidade=" + capacidade + ", velocidade=" + velocidade + "]";
	}

}
