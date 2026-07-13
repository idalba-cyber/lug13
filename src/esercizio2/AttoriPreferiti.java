package esercizio2;
import java.util.ArrayList;

public class AttoriPreferiti {

	ArrayList<String> Attori  = new ArrayList<>() ;
	
	
	public void stampaLista() {
		System.out.println("\nElenco Attori preferiti: ");
		for(int i=0; i<Attori.size(); i++) {
			System.out.println(Attori.get(i)); 
		}
	}

}
