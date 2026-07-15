package esercizio1;

public class Vacanze {
	public int anniDiServizio;
	int[] giorniVacanze = new int[4];
	
	public void setVacanze() {
		
		giorniVacanze[0] = 10; 
		giorniVacanze[1] = 15;
		giorniVacanze[2] = 20;
		giorniVacanze[3] = 25;
	}
	
	
	public void mostraGiorniVacanze() {
		if (anniDiServizio<0) {
			System.out.println("Dato errato");
		}
		else if(anniDiServizio<1) {
			System.out.println(giorniVacanze[0]);
		} 
		else if (anniDiServizio<= 3) {
			System.out.println(giorniVacanze[1]);
		}
		else if (anniDiServizio<=5) {
			System.out.println(giorniVacanze[2]);
		}
		else {
			System.out.println(giorniVacanze[3]);
		}
	}
}