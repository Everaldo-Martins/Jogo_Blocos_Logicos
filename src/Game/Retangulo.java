package Game;

public class Retangulo extends Formas {
	private double base;
	private double altura;
	
	public double calcularArea() {
		return base * altura;
	}

	public Retangulo() {
		super();
	}

	public Retangulo(int id, String nome, String cor, double base, double altura) {
		super(id, nome, cor);
		this.base = base;
		this.altura = altura;
	}

	@Override
	public String toString() {
		return "Retangulo [base=" + base + ", altura=" + altura + ", nome=" + nome + ", cor=" + cor + ", id=" + id
				+ ", calcularArea()=" + calcularArea() + "]";
	}	
}
