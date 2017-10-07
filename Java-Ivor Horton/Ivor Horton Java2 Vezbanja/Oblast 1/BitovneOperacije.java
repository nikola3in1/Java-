import static java.lang.Integer.toBinaryString;

public class  BitovneOperacije{
	public static void main(String[] args){
		
		int a = 0xFF07;	
		int b = 0x4;	//maska za izbor 3. bita;
		///Koriscenje bitovnog operatora AND za izbor treceg bita u indikatorima
		System.out.println("a		= " + toBinaryString(a));
		System.out.println("b		= " + toBinaryString(b));
		a &= b;
		System.out.println("a & b	= " + toBinaryString(a));
		
		a = 0xFF09;
		///Koriscenje bitovnog operatora OR za ukljucivanje treceg bita u indikatorima
		System.out.println("a		= " + toBinaryString(a));
		System.out.println("b		= " + toBinaryString(b));
		a |= b;
		System.out.println("a & b	= " + toBinaryString(a));
		
		///Koriscenje bitovnog operatora OR za izbor treceg bita u indikatorima
		System.out.println("\na		= " + toBinaryString(a));
		System.out.println("b		= " + toBinaryString(b));
		a &= b;
		System.out.println("a | b	= " + toBinaryString(a));

		///Ponovno iskljuvicanje treceg bita;
		a &= ~b;
		System.out.println("a & ~b	= " + toBinaryString(a));

	}	

}