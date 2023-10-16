package Game;

import java.util.LinkedList;

public class Tabuleiro extends Formas {
	protected double area;
	protected LinkedList<Formas> encaixes;
	
	public double calcularArea() {
		return area * area;
	}
	
	public Tabuleiro() {
		
	}

	public Tabuleiro(int id, String nome, String cor, double area, LinkedList<Formas> encaixes) {
		super(id, nome, cor);
		this.area = area;
		this.encaixes = encaixes;
	}

	@Override
	public String toString() {
		return "Tabuleiro [area=" + area + ", encaixes=" + encaixes + ", nome=" + nome + ", cor=" + cor + ", id=" + id
				+ ", calcularArea()=" + calcularArea() + "]";
	}		
}
