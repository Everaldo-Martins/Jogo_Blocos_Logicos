package Game;
public class Circulo extends Formas {
	private double PI = 3.14;
	private double raio;
	
	public double calcularArea() {
		return PI * (raio * raio);
	}
	
	public Circulo() {
		super();
	}

	public Circulo(int id, String nome, String cor, double raio) {
		super(id, nome, cor);
		this.raio = raio;
	}

	@Override
	public String toString() {
		return "Circulo [PI=" + PI + ", raio=" + raio + ", nome=" + nome + ", cor=" + cor + ", id=" + id
				+ ", calcularArea()=" + calcularArea() + "]";
	}		
}
