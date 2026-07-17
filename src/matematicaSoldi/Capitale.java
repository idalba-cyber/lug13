package matematicaSoldi;

public class Capitale {
	//calcolo degli anni necessari affinchè un capitale raddoppi in base a un certo tasso di interesse
	
	public static void main(String[] args) {
		double capitaleIniziale = 12500.50;
		double tassoInteresse = 2.2; //2,2%
		int anni = 0; //inizializzazione numero degli anni
		double capitaleAttuale = capitaleIniziale;
		
		while(capitaleAttuale <= 2*capitaleIniziale) { // argomento del while è che il capitale non sia raddoppiato
			
			capitaleAttuale += capitaleAttuale*tassoInteresse/100;
			// += equivale a: capitaleAtt = capitAtt + capitAtt*tassoInt/100
			anni++;
			System.out.println("Anno " + anni + ": " + capitaleAttuale);
			
		}
	}

}
