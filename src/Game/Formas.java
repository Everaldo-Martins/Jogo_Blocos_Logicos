package Game;

public class Formas implements IFormas {
	protected int id;
	protected String nome;
	protected String cor;	
	
	public double calcularArea() {
		return 0;
	}
	
	public Formas() {
		super();
	}

	public Formas(int id, String nome, String cor) {
		super();
		this.id = id;
		this.nome = nome;
		this.cor = cor;		
	}

	@Override
	public String toString() {
		return "Formas [nome=" + nome + ", cor=" + cor + ", id=" + id + ", calcularArea()=" + calcularArea() + "]";
	}	
}
