package Game;
public class Quadrado extends Formas {
	private double base;
	
	public double calcularArea() {
		return base * base;
	}

	public Quadrado() {
		super();		
	}

	public Quadrado(String nome, String cor, double id, double base) {
		super(nome, cor, id);
		this.base = base;
	}

	@Override
	public String toString() {
		return "Quadrado [base=" + base + ", nome=" + nome + ", cor=" + cor + ", id=" + id + ", calcularArea()="
				+ calcularArea() + "]";
	}
}