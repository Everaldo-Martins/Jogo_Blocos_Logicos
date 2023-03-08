package Jogo;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {
	public static void main(String[] args) throws InterruptedException {
		
		//----------------Peças--------------------
			
		//----------------Pequenas--------------------
			
		Circulo c = new Circulo();
		c.setNome("Circulo");
		c.setCor("Vermelho");
		c.setId(0);
		c.setRaio(1);
			
		//------------------------------------------------
			
		Quadrado q = new Quadrado();
		q.setNome("Quadrado");
		q.setCor("Verde");
		q.setId(1);
		q.setBase(3);
			
		//-----------------------------------------------
			
		Triangulo t = new Triangulo();
		t.setNome("Triangulo");
		t.setCor("Amarelo");
		t.setId(2);
		t.setBase(3);
		t.setAltura(5);
			
		//-----------------------------------------------		
			
		Retangulo r = new Retangulo();
		r.setNome("Retangulo");
		r.setCor("Azul");
		r.setId(3);
		r.setBase(3);
		r.setAltura(5);
			
		//---------------Grandes----------------------
			
		Circulo cm = new Circulo();
		cm.setNome("Circulo");
		cm.setCor("Vermelho");
		cm.setId(4);
		cm.setRaio(2);
			
		//------------------------------------------------
			
		Quadrado qm = new Quadrado();
		qm.setNome("Quadrado");
		qm.setCor("Verde");
		qm.setId(5);
		qm.setBase(6);
			
		//-----------------------------------------------
			
		Triangulo tm = new Triangulo();
		tm.setNome("Triangulo");
		tm.setCor("Amarelo");
		tm.setId(6);
		tm.setBase(6);
		tm.setAltura(10);
					
		//-----------------------------------------------		
			
		Retangulo rm = new Retangulo();
		rm.setNome("Retangulo");
		rm.setCor("Azul");
		rm.setId(7);
		rm.setBase(6);
		rm.setAltura(10);
			
		//----------------------------------------------
			
		LinkedList<Forma> pecas = new LinkedList<>();
			
		pecas.add(c);
		pecas.add(rm);
		pecas.add(t);
		pecas.add(qm);			
		pecas.add(cm);			
		pecas.add(r);
		pecas.add(q);
		pecas.add(tm);
			
		//-----------------Tabuleiro------------------
			
		//----------------Encaixes Pequemos--------------------
		Circulo ec = new Circulo();
		ec.setNome("Circulo");
		ec.setCor("Laranja");
		ec.setId(0);
		ec.setRaio(1);
			
		//------------------------------------------------
			
		Quadrado eq = new Quadrado();
		eq.setNome("Quadrado");
		eq.setCor("Laranja");
		eq.setId(1);
		eq.setBase(3);
			
		//-----------------------------------------------
			
		Triangulo et = new Triangulo();
		et.setNome("Triangulo");
		et.setCor("Laranja");
		et.setId(2);
		et.setBase(3);
		et.setAltura(5);
			
		//-----------------------------------------------		
			
		Retangulo er = new Retangulo();
		er.setNome("Retangulo");
		er.setCor("Laranja");
		er.setId(3);
		er.setBase(3);
		er.setAltura(5);
			
		//--------------- Encaixes Grandes ----------------------
			
		Circulo ecm = new Circulo();
		ecm.setNome("Circulo");
		ecm.setCor("Laranja");
		ecm.setId(4);
		ecm.setRaio(2);
			
		//------------------------------------------------
			
		Quadrado eqm = new Quadrado();
		eqm.setNome("Quadrado");
		eqm.setCor("Laranja");
		eqm.setId(5);
		eqm.setBase(6);
			
		//-----------------------------------------------
			
		Triangulo etm = new Triangulo();
		etm.setNome("Triangulo");
		etm.setCor("Laranja");
		etm.setId(6);
		etm.setBase(6);
		etm.setAltura(10);
			
		//-----------------------------------------------		
			
		Retangulo erm = new Retangulo();
		erm.setNome("Retangulo");
		erm.setCor("Laranja");
		erm.setId(7);
		erm.setBase(6);
		erm.setAltura(10);
			
		//----------------------------------------------
				
		LinkedList<Forma> encaixes = new LinkedList<>();
			
		encaixes.add(eq);			
		encaixes.add(eqm);
		encaixes.add(ec);
		encaixes.add(ecm);
		encaixes.add(et);
		encaixes.add(etm);
		encaixes.add(er);
		encaixes.add(erm); 
			
		//-----------------------------------------------
			
		//Calcular área do Tabuleiro soma de todos os encaixes OBS. a área do Triangulo será multiplicada por 2.
			
		double area = ec.calcularArea() + eq.calcularArea() + (et.calcularArea() * 2) + er.calcularArea() + ecm.calcularArea() + eqm.calcularArea() + (etm.calcularArea() * 2) + erm.calcularArea();
					
		Tabuleiro tabuleiro = new Tabuleiro(encaixes, area);
			
		//Jogo
		// O jogo é composto por um Tabuleiro que contém um número x de encaixes e um número x de peças.
			
		Jogo jogo = new Jogo(pecas, tabuleiro);
		//Desabiblita o erro do l do Scanner
		@SuppressWarnings("resource")
		Scanner l = new Scanner(System.in);
		LinkedList<Double> add = new LinkedList<>();
		String status = "Sem informação.";
			
		while(add.size() < 9) {			
			System.out.println(
					  "=======================================================\n"
					+ "==               JOGO - BLOCOS LÓGICOS               ==\n"
					+ "=======================================================\n"
					+ "-   Para jogar, junte a peça em seu respectivo        -\n"
					+ "- encaixes.                                           -\n"
					+ "- Ex.: 1 - Quadrado - 1.0 -> 5 - Quadrado - 1.0.      -\n"
					+ "-------------------------------------------------------\n"
					+ "|      - Tabuleiro -       |        - Formas -        |\n"
					+ "-------------------------------------------------------\n"
					+ "| + Encaixes:   + Área:    | + Peças:      + Área:    |\n"
					+ "-------------------------------------------------------");
			
			for(int i = 0; i < jogo.getTabuleiro().getEncaixes().size(); i++) {				
				System.out.println("| " + (i + 1) + " - " + String.format("%-9s", jogo.getTabuleiro().getEncaixes().get(i).getNome()) 
						+ " - " + String.format("%-9s", jogo.getTabuleiro().getEncaixes().get(i).calcularArea())
						+ "| " + (i + 1) + " - " + String.format("%-9s", jogo.getPecas().get(i).getNome())  
						+ " - " + String.format("%-9s", jogo.getPecas().get(i).calcularArea()) + "|\n"
						+ "-------------------------------------------------------");
			
			}		
			System.out.println("Vamos começar o Jogo?\n"
					+ "Última jogada: " + status + "\n"
					+ "-------------------------------------------------------");
			int forms = 0;
			int fittings = 0;
			while(true) {
				//Trata o erro de exerçẽs, ex. digita uma String no campo de um nextInt().
				try 
				{
					System.out.print("Informe o número do Encaixe: ");		
					fittings = Integer.parseInt(l.nextLine());
					
					System.out.print("Informe o número da Peça: ");		
					forms = Integer.parseInt(l.nextLine());
					
					if(fittings < 1 | fittings > 8){
						System.out.println(
								  "-------------------------------------------------------\n"
								+ "Erro: A opção [" + fittings + "] não consta no menu Encaixes.\n"
								+ "-------------------------------------------------------");
					}
					else if(forms < 1 | forms > 8){
						System.out.println(
								  "-------------------------------------------------------\n"
								+ "Erro: A opção [" + forms + "] não consta no menu Peças.\n"
								+ "-------------------------------------------------------");
					}
					else {
						break;
					}
				}
				catch (Exception e) {
					System.out.println(
							  "-------------------------------------------------------\n"
							+ "Erro: Por favor, informe um número inteiro.\n"
							+ "-------------------------------------------------------");
				}								
			}
				
			double fArea = jogo.getPecas().get(forms - 1).calcularArea();
			String fNome = jogo.getPecas().get(forms - 1).getNome();
			double eArea = jogo.getTabuleiro().getEncaixes().get(fittings - 1).calcularArea();
			String eNome = jogo.getTabuleiro().getEncaixes().get(fittings - 1).getNome();
							
			if(fArea == eArea & fNome == eNome) {
				if(add.contains(fArea)) {
					status = "Você já encaixou essa peça!";
					System.out.println(
							  "-------------------------------------------------------\n"
							+ "            " + status + "\n"
							+ "                 Tente novamente!\n"
							+ "-------------------------------------------------------");
				}
				else {
					status = "Encaixou!";
					System.out.println(
							  "-------------------------------------------------------\n"
							+ "                     " + status + "\n"
							+ "-------------------------------------------------------");				
					
					add.add(fArea);	
					if(add.size() >= 8) {													
						System.out.println("              "
								+ "Parabéns você venceu!!!\n"
								+ "  O jogo acabou, todas as peças foram encaixadas.\n"
								+ "-------------------------------------------------------");
						break;
					}
				}
				
			}
			else {
				status = "Não Encaixou!";
				System.out.println(
						  "-------------------------------------------------------\n"
						+ "                   " + status + "\n"
						+ "                 Tente novamente!\n"
						+ "-------------------------------------------------------");
			}
			TimeUnit.SECONDS.sleep(3);
		}		
	}
}
