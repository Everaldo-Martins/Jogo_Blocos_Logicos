package Game;

public class Data {
	private String init = "\u001b[";
	private String bold = "\u001b[1m";
	private String close = "\u001B[0m";
	private String[] color = {"30m", "31m", "32m", "33m", "34m", "35m", "36m"};
	protected void clear() {
		System.out.print("\033[H\033[2J");
		System.out.flush();
	}
	
	protected void line() {
		System.out.println("-------------------------------------------------------");
	}
	
	protected void header() {
		System.out.printf(
				  "=======================================================\n"
				+ "==%45s%19s==\n"
				+ "=======================================================\n"
				+ "- Para jogar, junte a peça em seu respectivo encaixe. -\n"
				+ "- Ex.: 1 - Quadrado - 1.0 -> 5 - Quadrado - 1.0.      -\n"
				+ "-------------------------------------------------------\n"
				+ "|      - %s  -      |        - %s -        |\n"
				+ "-------------------------------------------------------\n"
				+ "| + %s   + %s    | + %s      + %s    |\n"
				+ "-------------------------------------------------------\n"
				, bold+init+color[2]+"JOGO - BLOCOS LÓGICOS", close, bold+"Tabuleiro"+close, bold+"Formas"+close, init+color[6]+"Encaixes:"+close, init+color[5]+"Área:"+close, init+color[6]+"Peças:"+close, init+color[5]+"Área:"+close);
	}
	protected void winner() {
		line();
		System.out.printf("%52s\n%64s \n", bold+init+color[2]+"Parabéns você venceu!!!"+close, bold+init+color[2]+"O jogo acabou, todas as peças foram encaixadas."+close);
		line();
	}
	
}
