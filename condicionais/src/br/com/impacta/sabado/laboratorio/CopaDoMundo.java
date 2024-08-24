package br.com.impacta.sabado.laboratorio;

public class CopaDoMundo {

	public static void main(String[] args) {
				
		for (int ano = 1930 ; ano < 2024; ano += 4) {
			
			if(ano == 1942 || ano == 1946) {
				System.out.println("Não houve Copa do mundo de : " + ano);
				continue;
			}
			System.out.println("Copa do mundo de : " + ano);
		}
		
	}

}
