package br.com.impacta.sabado.switches;

public class ExemploSwitchCase {

	public static void main(String[] args) {
		int mes = 7;
		switch(mes) {
		case 1: System.out.println("janeiro"); break;
		case 2: System.out.println("fevereiro"); break;
		case 3: System.out.println("março"); break;
		case 4: System.out.println("abril"); break;
		case 5: System.out.println("maio"); break;
		case 6: System.out.println("junho"); break;
		case 7: System.out.println("julho"); break;
		case 8: System.out.println("agosto"); break;
		case 9: System.out.println("setembro"); break;
		case 10: System.out.println("outubro"); break;
		case 11: System.out.println("novembro"); break;
		case 12: System.out.println("dezembro"); break;
		default: System.out.println("mês nâo existe"); break;
		}	
		
		
		String pais = "argentina";
		switch(pais ) {
		case "Brasil" :  System.out.println("bom dia");
		case "Portugal" : System.out.println("bom dia"); break;
		case "Franca" :  System.out.println("bon jour"); break;
		case "Mexico" :
		case "argentina" : System.out.println("buenos dias boludos");
		case "Espanha":  System.out.println("buenos dias");break;
		default: System.out.println("bom dia");break;
		}

	}
	
	

}
