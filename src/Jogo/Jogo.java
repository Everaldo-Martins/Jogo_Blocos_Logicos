package Jogo;

import java.util.LinkedList;

public class Jogo {
	private LinkedList<Forma> pecas = new LinkedList<>();
	private Tabuleiro tabuleiro = new Tabuleiro();
	public Jogo() {
		
	}
	public Jogo(LinkedList<Forma> pecas, Tabuleiro tabuleiro) {
		this.pecas = pecas;
		this.tabuleiro = tabuleiro;
	}
	public LinkedList<Forma> getPecas() {
		return pecas;
	}
	public void setPecas(LinkedList<Forma> pecas) {
		this.pecas = pecas;
	}
	public Tabuleiro getTabuleiro() {
		return tabuleiro;
	}
	public void setTabuleiro(Tabuleiro tabuleiro) {
		this.tabuleiro = tabuleiro;
	}	
}