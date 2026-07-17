package Pitagora;

public class Pitagora {

	public static void main (String args[])  {
		
		int altezza = 10, larghezza = 10;
		
		for (int contaRighe=1; contaRighe <= altezza; contaRighe++) {
			
			for (int contaColonne =1; contaColonne<= larghezza; contaColonne++) {
				
				int prodotto = contaRighe*contaColonne; 
				System.out.printf("%4d", prodotto); 		
		}
			System.out.println();
		}

	}

}