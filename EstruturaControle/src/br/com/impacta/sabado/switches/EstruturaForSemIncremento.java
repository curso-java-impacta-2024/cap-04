package br.com.impacta.sabado.switches;

public class EstruturaForSemIncremento {

	public static void main(String[] args) {
		/* aqui no caso ocorre um decremento, pouco usado */
		for(int x = 10, y = 1; x != 1; System.out.println("Aqui n�o tem incremento")){
			x = x - y;
		}

	}

}
