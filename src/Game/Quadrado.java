package Game;
public class Quadrado extends Formas {
	private double base;
	
	public double calcularArea() {
		return base * base;
	}

	public Quadrado() {
		super();		
	}

	public Quadrado(int id, String nome, String cor, double base) {
		super(id, nome, cor);
		this.base = base;
	}

	@Override
	public String toString() {
		return "Quadrado [base=" + base + ", nome=" + nome + ", cor=" + cor + ", id=" + id + ", calcularArea()="
				+ calcularArea() + "]";
	}
}