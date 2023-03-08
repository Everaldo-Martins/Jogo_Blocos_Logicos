package Jogo;

public class Retangulo extends Forma {
	private double base = 0;
	private double altura = 0;
	
	public double calcularArea() {
		return base * altura;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}	
}
