package br.com.impacta.sabado.laboratorio;

import java.util.Scanner;

public class DiasMes {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
//		String dados;		
//		dados = scan.next();		
//		System.out.println(dados);
		
//		String mes = "Fevereiro";
		System.out.println("Digite o m�s");
		String mes = scan.nextLine();
		
		switch (mes) {
		
			case "Janeiro":
			case "Mar�o":
			case "Maio":
			case "Julho":
			case "Agosto":
			case "Outubo":
			case "Dezembro":
					System.out.println("Contem 31 Dias");
			break;	
		
			case "Fevereiro":	
				System.out.println("Contem 28 Dias");
				break;	
				
			case "Abril":
			case "Junho":
			case "Setembro":
			case "Novembro":
				System.out.println("Contem 30 Dias");
				break;
				
			default:
				System.out.println("Nao � um mes");
				break;
		}
		
		scan.close();
		
	}

}
