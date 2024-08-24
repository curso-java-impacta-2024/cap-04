package br.com.impacta.sabado.switches;

public class EstruturaWhiles {

	public static void main(String[] args) {
		int num = 0;
		while(num < 10) {
			num++;
			System.out.println("Valor de num é " + num);
		}
		do{
			num++;
			System.out.println("Valor do num no DoWhile é " + num);
		}while(num < 10);
		
//		String nome = "silvio";
//		do {
//			num++;
//			System.out.println(nome.charAt(num-1));
//		}while(num < nome.length());
	}
	
	

}
