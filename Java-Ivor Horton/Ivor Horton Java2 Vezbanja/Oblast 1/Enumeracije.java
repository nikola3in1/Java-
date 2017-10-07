

public class  Enumeracije{

enum Dan {Ponedeljak, Utorak, Sreda, Cetvrtak, Petak, Subota, Nedelja}

	public static void main(String[] args){
		
		Dan juce = Dan.Nedelja;
		Dan sutra = Dan.Utorak;
		Dan danas = Dan.Ponedeljak;		
		
		System.out.println("Juce je bio/la " + juce);
		System.out.println("Danas je "+ danas);
		System.out.println("Sutra ce biti " + sutra);

	}	

}