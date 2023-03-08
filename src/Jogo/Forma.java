package Jogo;
public class Forma implements IForma {
	private String nome = "";
	private String cor = "";
	private double id = 0;
	
	public double calcularArea() {
		return 0;
	}	
	
	public Forma() {
	}

	public Forma(String nome, String cor, double id) {
		this.nome = nome;
		this.cor = cor;
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public double getId() {
		return id;
	}

	public void setId(double id) {
		this.id = id;
	}	
}