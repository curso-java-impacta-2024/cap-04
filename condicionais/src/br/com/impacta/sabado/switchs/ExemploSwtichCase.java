package br.com.impacta.sabado.switchs;

public class ExemploSwtichCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//EXECUCAO DE PROCESSO DE SWTICH CASE EM ESTRUTURAS DE CONTROLE
		String pais = "Argentina";
		
		switch (pais){
			case "Brasil":
			case "Portugal":
				System.out.println("Bom dia!");
				break;
			case "França":
				System.out.println("Bon Jour!");
				break;
			case "Mexico":
			case "Argentina":
			case "Espanha":
				System.out.println("Buenos Dias!");
				break;
			default:
				System.out.println("Good Morning");
				break;
		}
		
		
	}

}
