/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validation;

import java.text.Normalizer;
import java.text.Normalizer.Form;

/**
 *
 * @author cenuser
 */
public class Validation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String s1 = "\uFE64" + "script" + "\uFE65";
        String s2 = "<script>";
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1.equals(s2));
        s1 = Normalizer.normalize(s1, Form.NFKC);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1.equals(s2));
        
        String s3 = "\uFB00";
        String s4 = "\u0066" + "\u0066";
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s3.equals(s4));
        
        String s5 = "www.google.com";
        String s6 = "www.goo" + "\u0261" + "le.com";
        String s7 = "www.goog" + "\u2063" + "le.com";
        System.out.println(s5 + " " + s5.length());
        System.out.println(s6 + " " + s6.length());
        System.out.println(s7 + " " + s7.length());
        System.out.println(s5.equals(s6));
        
        s5 = Normalizer.normalize(s5, Form.NFKD);
        s6 = Normalizer.normalize(s6, Form.NFKD);
        s7 = Normalizer.normalize(s7, Form.NFKD);
        System.out.println(s5 + " " + s5.length());
        System.out.println(s6 + " " + s6.length());
        System.out.println(s7 + " " + s7.length());        
        System.out.println(s5.equals(s6));        
    }
    
}
