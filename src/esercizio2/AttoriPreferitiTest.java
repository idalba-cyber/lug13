package esercizio2;

import java.util.ArrayList;

public class AttoriPreferitiTest {

	public static void main(String[] args) {
		
		AttoriPreferiti mieiAttori = new AttoriPreferiti();
		
		mieiAttori.Attori.add("Robert De Niro"); 
		mieiAttori.Attori.add("Marlon Brando"); 
		mieiAttori.Attori.add("Anthony Hopkins"); 
		mieiAttori.Attori.add("Tom Cruise"); 
		mieiAttori.Attori.add("Jack Nicholson");
		mieiAttori.stampaLista();
		
		mieiAttori.Attori.remove(0);
		
		mieiAttori.Attori.add(1, "Anthony Hopkins");
		
		mieiAttori.stampaLista();
		
	}

}
