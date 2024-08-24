package br.com.impacta.sabado.laboratorio;

public class NumerosPrimos {

	public static void main(String[] args) {
		int numero = 87;
		
		boolean isPrimo = true;
		
		if(numero <= 1) {
			isPrimo = false;		
		} else {
			for(int i = 2; i <= Math.sqrt(numero); i++) {
				if(numero % i == 0) {
					isPrimo = false;
					break;
				}
			}
		}
			if(isPrimo) {
				System.out.println(numero + " � um n�mero Primo" );
			} else {
				System.out.println(numero + " N�o � um n�mero Primo" );
			}
	}

}
