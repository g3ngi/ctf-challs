import java.util.Base64;

public class chall_4_source {
    public static void main(String args[]) {
        // algo: xor 0x54 jika ganjil, xor 0x64 jika genap -> base64 encode
        String plaintext = "FLAG{officially_missing_you}";
                            
        
        StringBuilder x = new StringBuilder();
        StringBuilder y = new StringBuilder();
        StringBuilder result = new StringBuilder();

        for(int i=0; i < plaintext.length(); i+=2){
            x.append((char) (((char) plaintext.charAt(i) ^ 0x45) + 40));
        }

        for(int i=1; i < plaintext.length(); i+=2){
            y.append((char) (((char) plaintext.charAt(i) ^ 0x50) + 40));
        }

        for (int i = 0; i < plaintext.length(); i++) {
            if (i % 2 == 0) {
                result.append(x.charAt(i / 2));
            } else {
                result.append(y.charAt(i / 2));
            }
        }

        
        System.out.println("Encrypted: " + result.toString());
    }

    public static String decrypt(String encryptedText) {
        StringBuilder decrypted = new StringBuilder();
        for (int i = 0; i < encryptedText.length(); i++) {
            char c = encryptedText.charAt(i);
            if (i % 2 == 0) {
                decrypted.append((char) ((c - 40) ^ 0x45));
            } else { 
                decrypted.append((char) ((c - 40) ^ 0x50));
            }
        }
        return decrypted.toString();
    }
}