import static java.lang.Integer.toHexString;


public class KontrolneSekvence{

	public static void main(String[] args){
	char a = 'X';			
	char b = '\u0058';	
	
	//// \b - povratnik 
	//// \f - prelazak na drugu stranu
	//// \n  - novi red
 	//// \r	- povratak na pocetak reda
	//// \t - tabulator
		
	System.out.println(a + " sa tastature \n");
	System.out.println(b + " sa hexadecimalnim codom unixa \n" );
	a++;
	System.out.println("ako povecamo za 1 dobijamo " + a + "\ntakodje char mozemo da primenimo i u aritmetickim operacijama i pretvaramo u druge tipove \"int\" long");
	
	System.out.println("Bilo koji int mozemo da prikazemo u hex " + Integer.toHexString((int)a));

	}	

}