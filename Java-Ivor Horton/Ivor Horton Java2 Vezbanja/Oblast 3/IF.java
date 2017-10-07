import static java.lang.Math.*;
public class IF{
	public static void main(String[] args){
		int broj = 0;
		broj = 1+ (int)(100*Math.random());

		if(broj % 2 != 0){
			System.out.println("Neparan " + broj);
		}
		else{
			System.out.println("Paran " + broj);
		}
	}
}