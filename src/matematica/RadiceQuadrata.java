package matematica;

public class RadiceQuadrata {

	public static void main(String[] args) {
		double radice = 1403; //numero di cui si vuole calcolare la radice quadrata
		double radiceQuadrata = radice; //duplico il valore di radice in un'altra variabile
		
		//applico la formula di convergenza e verifico l'accuratezza
		while (radiceQuadrata*radiceQuadrata - radice > 0.001) { //0.001 accuratezza scelta dal programmatore
			radiceQuadrata = (radiceQuadrata + radice/radiceQuadrata)/2; //formula di convergenza
			System.out.println("Prossimo tentativo con " + radiceQuadrata);
			
		}
		//uscito dal ciclo while, il programma continua qui
		System.out.println("La radice quadrata di " + radice + " è: " + radiceQuadrata); 

	}

}
