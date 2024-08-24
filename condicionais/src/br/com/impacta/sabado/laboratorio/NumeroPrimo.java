package br.com.impacta.sabado.laboratorio;

public class NumeroPrimo {

	public static void main(String[] args) {
		
		int numero = 11;
		
		boolean isPrimo = true;
		
		if(numero <= 1) {
			isPrimo = false;
		}else {
				
			for (int i = 2; i <= Math.sqrt(numero); i++) {
				if(numero % i == 0) {
					isPrimo = false;
					break;
				}
			}
			
			if(isPrimo) {
				System.out.println(numero + " é um número Primo!");
			}else {
				System.out.println(numero + " não é um número Primo!");
			}
			
			
		}
				
		
		

	}

}
