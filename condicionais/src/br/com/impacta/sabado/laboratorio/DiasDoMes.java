package br.com.impacta.sabado.laboratorio;

import java.util.Scanner;

public class DiasDoMes {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		boolean chave = true;
		
		
		while (chave) {
	
			System.out.println("Digite o m�s de seu  nascimento:");

			String mes = scan.nextLine();

			switch (mes) {
			case "Janeiro":
			case "Mar�o":
			case "Maio":
			case "Julho":
			case "Agosto":
			case "Outubro":
			case "Dezembro":
				System.out.println("O m�s de " + mes + " tem 31 dias.");
				break;
			case "Abril":
			case "Junho":
			case "Setembro":
			case "Novembro":
				System.out.println("O m�s de " + mes + " tem 30 dias.");
				break;
			case "Fevereiro":
				System.out.println("Este m�s tem 28 dias.");
				break;
			default:
				System.out.println("Este m�s n�o existe.");
				break;
			}
		}

		scan.close();
	
		// String dados;
		//
		// System.out.println("Digite alguma coisa!!");
		// dados = scan.nextLine();
		// scan.close();
		// System.out.println(dados);
		//
	}

}
