enum WashChoice {cotton, linen, wool}
public class SwitchEnum{
	public static void main(String[] args){
		WashChoice wash = WashChoice.linen;
		switch(wash){
			case cotton:
				System.out.println("Cotton selected");
				break;

			case linen:
				System.out.println("Linen selected");
				break;

			case wool:
				System.out.println("Wool selected");
				break;
		}
		
	}
}