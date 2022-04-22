import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TDDPigLatinTest {

	@Test
	void testForLowercase() {
		String expected = "gym";
		String actual = TDDPigLatin.Translate("Gym");
		assertEquals(expected, actual);
	}
	
	@Test
	void testForVowelBeginning() {
		String expected = "appleway";
		String actual = TDDPigLatin.Translate("apple");
		assertEquals(expected, actual);
	}
	
	@Test
	void testForVowelBeginningAndLowercase() {
		String expected = "appleway";
		String actual = TDDPigLatin.Translate("Apple");
		assertEquals(expected, actual);
	}
	
	@Test
	void testForVowelBeginning2() {
		String expected = "eggway";
		String actual = TDDPigLatin.Translate("egg");
		assertEquals(expected, actual);
	}
	
	@Test
	void testForVowelBeginning3() {
		String expected = "iglooway";
		String actual = TDDPigLatin.Translate("igloo");
		assertEquals(expected, actual);
	}
	
	@Test
	void testForVowelBeginning4() {
		String expected = "oreoway";
		String actual = TDDPigLatin.Translate("oreo");
		assertEquals(expected, actual);
	}
	
	@Test
	void testForVowelBeginning5() {
		String expected = "unevenway";
		String actual = TDDPigLatin.Translate("uneven");
		assertEquals(expected, actual);
	}
	
	@Test
	void testFor1Consonant() {
		String expected = "onglay";
		String actual = TDDPigLatin.Translate("long");
		assertEquals(expected, actual);
	}
	
	@Test
	void testFor1Consonant2() {
		String expected = "andalsay";
		String actual = TDDPigLatin.Translate("sandal");
		assertEquals(expected, actual);
	}
	
	@Test
	void testFor2consonants() {
		String expected = "ingwray";
		String actual = TDDPigLatin.Translate("wring");
		assertEquals(expected, actual);
	}
	
	@Test
	void testFor3consonants() {
		String expected = "aightstray";
		String actual = TDDPigLatin.Translate("straight");
		assertEquals(expected, actual);
	}
	
	

}
