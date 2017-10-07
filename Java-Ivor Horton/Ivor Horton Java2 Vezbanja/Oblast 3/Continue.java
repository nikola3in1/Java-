public class Continue{
	public static void main(String[] args){
		long limit = 20L;
		long faktorijel = 1L;


		Outerloop:
		for(long i = 1L; i <= limit; i++){
			faktorijel = 1l;


			for (long faktor = 2;faktor <= i ; faktor++ ) {
								//i = 5;
													//2, 6, 24, 120
				if(i> 10L && i% 2L == 1L){
					continue Outerloop;
				}
				faktorijel *= faktor;
			} 
			System.out.println(i + "! is "+ faktorijel);
		}


	}
}