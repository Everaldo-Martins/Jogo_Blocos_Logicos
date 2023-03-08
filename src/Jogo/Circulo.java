package Jogo;
public class Circulo extends Forma {
	private static final double PI = 3.14;
	private double raio = 0;
	
	public double calcularArea() {
		return PI * (raio * raio);
	}	
	public double getRaio() {
		return raio;
	}
	public void setRaio(double raio) {
		this.raio = raio;
	}
}