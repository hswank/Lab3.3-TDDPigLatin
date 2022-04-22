
public class TDDPigLatin {

	public static void main(String[] args) {

	}

	public static String Translate(String word) {
		String Word = word;
		String lowerWord = Word.toLowerCase();
		boolean firstLetterConsonant = true;

		String vowels = "aeiou";
		int i = 0;
		for (i = 0; i < lowerWord.length(); i++) {
			if (vowels.contains(lowerWord.substring(i, i + 1))) {
				break;
			}
		}

		if (i < lowerWord.length()) {
			if (vowels.contains(lowerWord.substring(0, 1))) {
				lowerWord += "way";
			} else {
				while (firstLetterConsonant) {
					if (vowels.contains(lowerWord.substring(0, 1))) {
						firstLetterConsonant = false;
					} else {
						lowerWord = lowerWord.substring(1, lowerWord.length()) + lowerWord.substring(0, 1);
					}
				}
				lowerWord += "ay";
			}
		}

		return lowerWord;
	}
}
