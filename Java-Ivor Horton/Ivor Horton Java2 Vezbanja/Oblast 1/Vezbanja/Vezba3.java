//import static java.lang.Math.*;
public class Vezba3{

	public static void main(String[] args){
	
		double plata = 1234;

		double porez = (plata/100) * 35;
		double porezCash = porez;
		int dolari = (int) porez;
		double konverzija = porezCash - (double)dolari;
		double konverzija2 = konverzija * 100;
		int centi = (int) konverzija2;
		
		
		
		
		System.out.println(porez +" "+ konverzija +" ");
		System.out.println("$: "+dolari +" centi: "+ centi);		



		
				


	}
}