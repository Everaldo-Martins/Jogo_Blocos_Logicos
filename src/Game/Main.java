package Game;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {
	public static void main(String[] args) {
		//Peças
		Circulo c = new Circulo(0, "Circulo", "Vermelho", 1);
		Quadrado q = new Quadrado(1, "Quadrado", "Verde", 3);
		Triangulo t = new Triangulo(2, "Triangulo", "Amarelo", 3, 5);
		Retangulo r = new Retangulo(3, "Retangulo", "Azul", 3, 5);

		Circulo cm = new Circulo(4, "Circulo", "Vermelho", 2);
		Quadrado qm = new Quadrado(5, "Quadrado", "Verde", 6);
		Triangulo tm = new Triangulo(6, "Triangulo", "Amarelo", 6, 10);
		Retangulo rm = new Retangulo(7, "Retangulo", "Azul", 6, 10);
		
		//Encaixes
		Circulo ec = new Circulo(8, "Circulo", "Laranja", 1);
		Quadrado eq = new Quadrado(9, "Quadrado", "Laranja", 3);
		Triangulo et = new Triangulo(10, "Triangulo", "Laranja", 3, 5);
		Retangulo er = new Retangulo(11, "Retangulo", "Laranja", 3, 5);
		
		Circulo ecm = new Circulo(12, "Circulo", "Laranja", 2);
		Quadrado eqm = new Quadrado(13, "Quadrado", "Laranja", 6);
		Triangulo etm = new Triangulo(14, "Triangulo", "Laranja", 6, 10);
		Retangulo erm = new Retangulo(15, "Retangulo", "Laranja", 6, 10);
		
		LinkedList<Formas> pecas = new LinkedList<>();

		pecas.add(c);
		pecas.add(rm);
		pecas.add(t);
		pecas.add(qm);
		pecas.add(cm);
		pecas.add(r);
		pecas.add(q);
		pecas.add(tm);			

		LinkedList<Formas> encaixes = new LinkedList<>();

		encaixes.add(eq);
		encaixes.add(eqm);
		encaixes.add(ec);
		encaixes.add(ecm);
		encaixes.add(et);
		encaixes.add(etm);
		encaixes.add(er);
		encaixes.add(erm);

		double area = eq.calcularArea() + eqm.calcularArea() + ec.calcularArea() + ecm.calcularArea() + et.calcularArea() + etm.calcularArea() + er.calcularArea() + erm.calcularArea();
		
		Tabuleiro tabuleiro = new Tabuleiro(0, "Tabuleiro", "Laranja", area, encaixes);

		Jogo jogo = new Jogo(pecas, tabuleiro);
		Scanner  input = new Scanner(System.in);
		Data data = new Data();
		LinkedList<Double> add = new LinkedList<>();
		String status = "Sem informação.";

		do {
			data.header();
					
			for (int i = 0; i < jogo.tabuleiro.encaixes.size(); i++) {
				System.out.printf("| %d - %-9s - %-9s| %d - %-9s - %-9s|\n", i + 1, jogo.tabuleiro.encaixes.get(i).nome, jogo.tabuleiro.encaixes.get(i).calcularArea(), i + 1, jogo.pecas.get(i).nome, jogo.pecas.get(i).calcularArea());
				data.line();
			}
			
			System.out.printf("- %s\n- Última jogada: %s\n", add.size() > 0 ? "Boa sorte." : "Vamos começar o Jogo?", status);
			data.line();
			
			char forms, fittings;
			
			System.out.print("Informe o número do Encaixe: ");		
			fittings = input.next().toLowerCase().charAt(0);
			
			System.out.print("Informe o número da Peça: ");		
			forms = input.next().toLowerCase().charAt(0);
			
			if(Character.getNumericValue(fittings) < 1 || Character.getNumericValue(fittings) > 8){
				data.line();
				System.out.printf("Erro: A opção [%c] não consta no menu Encaixes.\n", fittings);
				data.line();
				fittings = '1';
			}
			else if(Character.getNumericValue(forms) < 1 || Character.getNumericValue(forms) > 8){
				data.line();
				System.out.printf("Erro: A opção [%c] não consta no menu Peças.\n", forms);
				data.line();
				forms = '1';
			}
			else if(Character.isLetter(fittings) || Character.isLetter(forms)){
				data.line();
				System.out.print("Erro: Por favor, informe um número inteiro.\n");
				data.line();
				if(Character.isLetter(fittings))
					fittings = '1';
				if(Character.isLetter(forms))
					forms = '1';
			}
				
			double fArea = jogo.pecas.get(Character.getNumericValue(forms) - 1).calcularArea();
			String fNome = jogo.pecas.get(Character.getNumericValue(forms) - 1).nome;
			double eArea = jogo.tabuleiro.encaixes.get(Character.getNumericValue(fittings) - 1).calcularArea();
			String eNome = jogo.tabuleiro.encaixes.get(Character.getNumericValue(fittings) - 1).nome;
							
			if(fArea == eArea && fNome == eNome) {				
				if(add.contains(fArea)) {
					status = "\u001B[33mVocê já encaixou essa peça!\u001B[0m";
					data.line();
					System.out.printf("%50s\n%35s\n", status, "Tente novamente!");
					data.line();					
				}
				else {
					status = "\u001B[32mEncaixou\u001B[0m";
					data.line();
					System.out.printf("%40s\n", status);
					data.line();					
					add.add(fArea);						
				}
				
			}
			else {
				status = "\u001B[31mNão Encaixou\u001B[0m";
				data.line();
				System.out.printf("%42s\n%35s\n", status, "Tente novamente!");
				data.line();
			}
			try {
				if(add.size() == 8) {
					data.winner();
				}
				TimeUnit.SECONDS.sleep(3);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			data.clear();
		} while (add.size() < 8);
		input.close();
	}
}
