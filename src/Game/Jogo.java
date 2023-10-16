package Game;

import java.util.LinkedList;

public class Jogo {
	protected LinkedList<Formas> pecas = new LinkedList<>();
	protected Tabuleiro tabuleiro = new Tabuleiro();
	
	public Jogo() {
		super();
	}

	public Jogo(LinkedList<Formas> pecas, Tabuleiro tabuleiro) {
		super();
		this.pecas = pecas;
		this.tabuleiro = tabuleiro;
	}

	@Override
	public String toString() {
		return "Jogo [pecas=" + pecas + ", tabuleiro=" + tabuleiro + "]";
	}	
}