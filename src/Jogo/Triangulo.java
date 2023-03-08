package Jogo;

public class Triangulo extends Forma {
	private double base = 0;
	private double altura = 0;
	
	public double calcularArea(){
		return (base * altura) / 2;
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
