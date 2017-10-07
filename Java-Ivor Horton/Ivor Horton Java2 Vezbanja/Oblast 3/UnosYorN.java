public class UnosYorN{
	public static void main(String[] args){
		char yesNo = 'N';

		switch(yesNo){
			case 'n' : case 'N':
				System.out.println("NO!");
			break;

			case 'y' : case 'Y' :
				System.out.println("YES!");
			break; 

		}
	}
}