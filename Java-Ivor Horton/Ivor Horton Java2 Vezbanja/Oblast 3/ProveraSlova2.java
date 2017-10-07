import static java.lang.Character.isUpperCase;
import static java.lang.Character.isLowerCase;
import static java.lang.Math.random;
public class ProveraSlova2{
	public static void main(String[] args){
		char simbol = 'A';
		simbol = (char) (123.0 * Math.random());
		if(isUpperCase(simbol)){
			System.out.println("Veliko slovo "+ simbol);
		}else if(isLowerCase(simbol)){
			System.out.println("Malo slovo "+ simbol);
		}
		else {
			System.out.println("Nije slovo " + simbol);
		}
	}
}