package caesar_cipher;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String message = "Where are you from?";
		int offset = 12;
		
		CaesarsCipher caesarsCipher = new CaesarsCipher();
		String cipheredMessage = caesarsCipher.cipher(message, offset);
		
		System.out.println("Message: " + message);
		System.out.println("Offset: " + offset);
		System.out.println("Ciphered message: " + cipheredMessage);	
	}

}
