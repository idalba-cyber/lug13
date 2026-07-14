package esercizio3;

import java.util.Scanner;
import java.util.ArrayList;


public class ScannerNomi{
    
	ArrayList<String> Nomi  = new ArrayList<>() ;
	
   
    public void inserisciNomi() {
    	
    	System.out.print("DIGITA I NOMI - (scrivi 'stop' per terminare)\n"); 
    	Scanner scanner = new Scanner(System.in);
         

         while (true) {
             System.out.print("Nome: ");
             String input = scanner.nextLine();

             if (input.equals("stop")) {
                 break;
             } else
             	{ Nomi.add(input); }
         }
      }
    
    public void stampaNomi() {
    	
    	System.out.println("\nElenco Nomi: ");
    	for(int i=0; i<Nomi.size(); i++) {
    		System.out.println(Nomi.get(i)); 
    	}
    }
}
