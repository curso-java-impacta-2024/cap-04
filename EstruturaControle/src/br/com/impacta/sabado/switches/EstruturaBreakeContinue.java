package br.com.impacta.sabado.switches;

public class EstruturaBreakeContinue {

	public static void main(String[] args) {
		
		//exemplo break

		for(int i = 1; i < 11; ++i){
					if(i==5)
						break; // interrompe o loop
					System.out.println("Valor de i = " + i);
				}
				System.out.println("Próxima linha após o loop...");
		
	
		// exemplo continue
		int num = 0;
		
		while(num<10){
			++num;
			if(num==5){
				continue; //aqui ele pula o 5 e volta pro inicio
			}
			System.out.println("Valor de num = " + num);
		}
		for (int i = 5; i <=10;) {
			System.out.println(i);
			 i++;
		}
	}	
}
