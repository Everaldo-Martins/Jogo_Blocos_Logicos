package Game;

public class Formas implements IFormas {
	protected String nome;
	protected String cor;
	protected double id;
	
	public double calcularArea() {
		return 0;
	}
	
	public Formas() {
		super();
	}

	public Formas(String nome, String cor, double id) {
		super();
		this.nome = nome;
		this.cor = cor;
		this.id = id;
	}

	@Override
	public String toString() {
		return "Formas [nome=" + nome + ", cor=" + cor + ", id=" + id + ", calcularArea()=" + calcularArea() + "]";
	}	
}
