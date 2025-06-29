package caesar_cipher;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CaesarCipherTest {
	
	private CaesarsCipher caesarCipher = new CaesarsCipher();

	@Test
	void testCipheredMessageWithOffsetOf12() {
		assertEquals("ctqdq mdq kag rdaye", caesarCipher.cipher("Where are you from?", 12));
	}
	
	@Test
	void testEmptyString() {
		assertEquals("",caesarCipher.cipher("", 12));
	}
	
	//@Test 
	//void testCipheredMessageWithOffsetOf11 (){
		//assertEquals("ctqdq mdq kag rday e", caesarCipher.cipher("Where are you from?", 11));
	//}

}
