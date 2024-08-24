package br.com.impacta.sabado.laboratorio;

public class CopaDoMundo {

	public static void main(String[] args) {
		
	
		for(int i = 1930; i < 2024; i+=4) {

			if(i == 1942 || i == 1946) 
				continue;
			System.out.println(i);
			
		}
	}

}
