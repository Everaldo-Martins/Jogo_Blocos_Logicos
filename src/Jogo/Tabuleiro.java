package Jogo;

import java.util.LinkedList;

public class Tabuleiro {
	private LinkedList<Forma> encaixes = new LinkedList<>();
	private double area = 0;
	
	public Tabuleiro() {
		
	}

	public Tabuleiro(LinkedList<Forma> encaixes, double area) {
		this.encaixes = encaixes;
		this.area = area;
	}

	public LinkedList<Forma> getEncaixes() {
		return encaixes;
	}

	public void setEncaixes(LinkedList<Forma> encaixes) {
		this.encaixes = encaixes;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}	
}
