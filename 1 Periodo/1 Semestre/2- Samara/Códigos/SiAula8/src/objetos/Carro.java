package objetos;

public class Carro {
	
	String cor;
	String marca;
	String modelo;
	
	public Carro(String marca) {
		this.marca = marca;
		this.cor = "branco";
		
	}
	
	public void acelerar() {
		System.out.println("Acelerando o carro");
	}
	
	public void freiar() {
		System.out.println("Freiando o carro");
	}
	
	public void virarDireita() {
		System.out.println("Virando o carro para a direita");
	}
	
	public void virarEsquerda() {
		System.out.println("Virando o carro para a esquerda");
	}

}
