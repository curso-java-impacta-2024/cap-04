package br.com.impacta.sabado.fors;

public class ExemploContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 0;
		while(num<10){
			++num;
			if(num==5){
				continue;
			}
			System.out.println("Valor de num = " + num);
		}

	}

}
