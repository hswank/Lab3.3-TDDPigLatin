import java.util.Scanner;

public class PigLatinPrompt {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter a word to be translated to pig latin: ");
		String userWord = input.next();
		
		String translatedWord = TDDPigLatin.Translate(userWord);
		
		input.close();
		System.out.println(userWord + " in pig latin is " + translatedWord);
	}
}
