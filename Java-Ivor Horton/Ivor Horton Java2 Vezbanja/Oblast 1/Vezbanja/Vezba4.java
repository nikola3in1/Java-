import static java.lang.Math.*;
public class Vezba4{
	public static void main(String[] args){
		double SunceV = 0;
		double ZemljaV = 0;
		double SuncePoluPrecnik = 1390920/2;
		double ZemljaPoluPrecink = 12200/2;
		SunceV = 4/3 * Math.PI * Math.pow(SuncePoluPrecnik,3);
		ZemljaV = 4/3 * Math.PI * Math.pow(ZemljaPoluPrecink,3);

		System.out.println(SunceV +"\n" + ZemljaV);
	}
}