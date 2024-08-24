package br.com.impacta.sabado.switches;

import java.util.Scanner;

public class Laboratorio {

	public static void main(String[] args) {
		
		//laboratorio 1
		int numero = 11;
		
		boolean isPrimo = true;
		if(numero<= 1 ) {
			
			isPrimo = false;
			
		}else {
			
			for(int i = 2; i<=Math.sqrt(numero); i++) {
				if(numero%i==0) {
					isPrimo = false;
					break;
				}
			}
			if(isPrimo) {
				System.out.println(numero + " � um n�mero primo");
			}else {
				System.out.println(numero + " n�o � um n�mero primo");
			}
			
		}
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o m�s do seu nascimento");
		String mes = entrada.nextLine();
		
		//laboratorio 2
		
		switch(mes) {
		case "Janeiro" : 
		case "Mar�o" : 
		case "Maio" :
		case "Julho" :
		case "Agosto" :
		case "Outubro" :
		case "Dezembro" :
			System.out.println("O m�s escolhido tem 31 dias"); break;
		case "Fevereiro" :
			System.out.println("O m�s escolhido tem 28 dias"); break;
		case "Abril" :
		case "Junho" :
		case "Setembro" :
		case "Novembro" :
			System.out.println("O m�s escolhido tem 30 dias"); break;
		
		default : System.out.println("m�s inv�lido"); break;
		} 
		
		entrada.close();
		
		
		
		//laboratorio 3
		
		for(int ano = 1930; ano < 2024; ano +=4) {
			if(ano==1942 || ano==1946) {
				continue;
			}
			System.out.println("Copa do Mundo de " + ano + "!");
		}
		
	
	}

}
