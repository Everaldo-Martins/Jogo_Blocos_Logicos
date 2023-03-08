package Jogo;
public class Quadrado extends Forma {
	private double base = 0;
	
	public double calcularArea() {
		return base * base;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

}