import static java.lang.Math.*;
public class ProveraSlova{
	public static void main(String[] args){
		char simbol = 'A';
		simbol = (char)(128.0*Math.random());
		
		if(simbol >= 'A'){
			if(simbol <= 'Z'){
				System.out.println("Veliko slovo "+ simbol);			
			}
		}else{
			if(simbol >= 'a'){
				if(simbol <= 'z'){
					System.out.println("Malo slovo "+ simbol);
				}else{
					System.out.println("Nije slovo");
				}

			}else{
				System.out.println("Nije slovo");
			}

		}



	}
}