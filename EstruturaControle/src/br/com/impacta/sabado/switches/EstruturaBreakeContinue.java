package br.com.impacta.sabado.switches;

public class EstruturaBreakeContinue {

	public static void main(String[] args) {

		for(int i = 1; i < 11; ++i){
					if(i==5)
						break; // interrompe o loop
					System.out.println("Valor de i = " + i);
				}
				System.out.println("Pr�xima linha ap�s o loop...");
		
			}
}
