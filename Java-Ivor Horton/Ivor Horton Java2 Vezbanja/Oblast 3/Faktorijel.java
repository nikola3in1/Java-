public class Faktorijel{
	public static void main(String[] args){
		long limit = 20L;
		long faktorijel = 1L;

		for(long i = 1L; i <= limit; i++){
			faktorijel = 1l;


			for (long faktor = 2;faktor <= i ; faktor++ ) {
				faktorijel *= faktor;	//i = 5;
										//2, 6, 24, 120
			} 
			System.out.println(i + "! is "+ faktorijel);
		}


	}
}