package questao2;

public class Aviao extends Transporte {
	
	private int numTurbinas;

	public Aviao(int capacidade, double velocidade, int numTurbinas) {
		super(capacidade, velocidade);
		this.numTurbinas = numTurbinas;
	}

	public int getNumTurbinas() {
		return numTurbinas;
	}

	public void setNumTurbinas(int numTurbinas) {
		this.numTurbinas = numTurbinas;
	}

	@Override
	public void mostrarDetalhes() {
		// TODO Auto-generated method stub
		
	}
	
	

}
