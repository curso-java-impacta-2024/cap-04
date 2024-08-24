package br.com.impacta.sabado.fors;

public class exemploBreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1; i < 11; ++i){
			if(i==5)
				break; // interrompe o loop
			System.out.println("Valor de i = " + i);
		}
		System.out.println("Próximo linha após o loop...");


	}

}
