package esercizio1;

public class Vacanze {
	public int anniDiServizio;
	int[] giorniVacanze = new int[7];
	
	public void setVacanze() {
		
		 giorniVacanze[0] = 10;  
	     giorniVacanze[1] = 15;  
	     giorniVacanze[2] = 15; 
	     giorniVacanze[3] = 15; 
	     giorniVacanze[4] = 20;  
	     giorniVacanze[5] = 20; 
	     giorniVacanze[6] = 25; 
	}
	
	
	public void mostraGiorniVacanze() {
		
		if (anniDiServizio<0) {
			System.out.println("Dato errato");
			return;
		} 
		
		int i= anniDiServizio; 
		
		if (i < 1) {
		    i = 0;
		} 
		else if (i > 5) {
		    i = 6;
		}
	   
		System.out.println("Con " + anniDiServizio + " anni di servizio hai: " + giorniVacanze[i] + " giorni di vacanza." ); 
	 }
} 