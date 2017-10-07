import static java.lang.Math.*;
import static java.lang.Long.*;
import static java.lang.Integer.*;
public class Vezba2{

	public static void main(String[] args){
		

		double a = 1234.5678;
		double a1 = 0.0;
		double cash = 0.0;
						

		long b = (long)a;	//iza	
		cash = (double)b;
		
		

		a1 = (a-cash) * 10000 ; //dobijamo brojeve iza zareza
		
		System.out.println((long)cash +"."+ (long)a1);
		
		
		

	

		
				


	}
}