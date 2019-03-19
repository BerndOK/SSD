package jca.crypt;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;

import java.security.Key;
import java.security.SecureRandom;

public class KeyGeneratorExample {
   public static void main(String args[]) throws Exception{
      //Creating a KeyGenerator object
      KeyGenerator keyGen = KeyGenerator.getInstance("AES");
      
      //Creating a SecureRandom object
      SecureRandom secRandom = new SecureRandom();
      
      //Initializing the KeyGenerator
      keyGen.init(secRandom);
      
      //Creating/Generating a key
      Key key = keyGen.generateKey();
      
      System.out.println(key);      
      Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");      
      cipher.init(cipher.ENCRYPT_MODE, key);      

      String msg = new String("Hi how are you");
      byte[] bytes = cipher.doFinal(msg.getBytes());      
      System.out.println(new String(bytes));
      cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
      cipher.init(cipher.DECRYPT_MODE, key);      
      System.out.println(new String(cipher.doFinal(bytes)));
   }
}