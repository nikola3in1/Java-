import static java.lang.Math.*;
enum Season {Spring, Winter, Summer, Fall}
public class UporedjivanjeEnuma{
	public static void main(String[] args){
		Season best = Season.Winter;
		Seaso n season = Season.Summer;
		if(season.equals(best)){
			System.out.println("vrednosti su iste");
		}else{
			System.out.println("Vredonst se razlikuju\n" +season +"/"+ best);
		}
	}
}