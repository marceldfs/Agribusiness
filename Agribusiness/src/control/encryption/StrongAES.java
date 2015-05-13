package control.encryption;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
 
public class StrongAES {
 
   
    
    public static String encrypt(String texto){
	 
	 try {
		  String text = texto;
	         String key = "Bar12345Bar12345"; // 128 bit key
	         
	         // Create key and cipher
	         Key aesKey = new SecretKeySpec(key.getBytes(), "AES");
	         Cipher cipher = Cipher.getInstance("AES");
	 
	         // encrypt the text
	         cipher.init(Cipher.ENCRYPT_MODE, aesKey);
	         byte[] encrypted = cipher.doFinal(text.getBytes());
	         //System.err.println(new String(encrypted));
	         
	         return new String(encrypted);
	} catch (Exception e) {
		
	}
	return null;
	
 }
    public static String decrypt(String encrypt){
	 byte[] encrypted= encrypt.getBytes();
	 try {
		 
		 String key = "Bar12345Bar12345"; // 128 bit key
         
         // Create key and cipher
         Key aesKey = new SecretKeySpec(key.getBytes(), "AES");
         Cipher cipher = Cipher.getInstance("AES");
         //byte[] encrypted = cipher.doFinal(text.getBytes());
		  // decrypt the text
         cipher.init(Cipher.DECRYPT_MODE, aesKey);
         String decrypted = new String(cipher.doFinal(encrypted));
         System.err.println(decrypted);
        return new String(decrypted);
	} catch (Exception e) {
		// TODO: handle exception
	}
	return null;
	
	 
 }
    public static void main(String[] args) {
      
       
       // teste deste codigo
       String a1=encrypt("rui");
       System.out.println(a1);
       System.out.println(decrypt(a1));
     
    }
}
