package br.com.impacta.sabado.switchs;


public class ExemploSwitchCase {
	public static void main(String args[]){
		int mes = 15;
		switch(mes){
			case 1: System.out.println("Janeiro"); break;
			case 2: System.out.println("Fevereiro"); break;
			case 3: System.out.println("Mar�o"); break;
			case 4: System.out.println("Abril"); break;
			case 5: System.out.println("Maio"); break;
			case 6: System.out.println("Junho"); break;
			case 7: System.out.println("Julho"); break;
			case 8: System.out.println("Agosto"); break;
			case 9: System.out.println("Setembro"); break;
			case 10: System.out.println("Outubro"); break;
			case 11: System.out.println("Novembro"); break;
			case 12: System.out.println("Dezembro"); break;
			default: System.out.println("M�s n�o existe.");
		}
		
		System.out.println("=========================");
		
		String pais = "argentina";
		
		switch (pais) {
		case "argentina":
			System.out.println("Buenos Dias hermanos!");
		case "Brasil":
			System.out.println("Bom dia!");
		case "M�xico":
			System.out.println("Hola Buenos dia!");
		case "Portugal":
			System.out.println("Bom dia!");
			break;
		case "Fran�a":
			System.out.println("Bon Jour!");
			break;
		case "Espanha":
			System.out.println("Buenos Dias!");
			break;
		default:
			System.out.println("Good Morning!");
			
			break;
		}
	}
}


