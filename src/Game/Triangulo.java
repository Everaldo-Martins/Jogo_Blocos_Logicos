package Game;

public class Triangulo extends Formas {
	private double base;
	private double altura;
	
	public double calcularArea(){
		return (base * altura) / 2;
	}

	public Triangulo() {
		super();
	}

	public Triangulo(String nome, String cor, double id, double base, double altura) {
		super(nome, cor, id);
		this.base = base;
		this.altura = altura;
	}

	@Override
	public String toString() {
		return "Triangulo [base=" + base + ", altura=" + altura + ", nome=" + nome + ", cor=" + cor + ", id=" + id
				+ ", calcularArea()=" + calcularArea() + "]";
	}	
}
