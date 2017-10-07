public class ForEnum{
	enum Season {Spring, Fall, Winter, Summer}
	public static void main(String[] args){

		for(Season season : Season.values()){
			System.out.println("Season is " + season);
		}
	}
}