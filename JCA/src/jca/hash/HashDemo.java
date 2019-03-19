/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jca.hash;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author cenuser
 */
public class HashDemo {

    private final static int MAX_PW = 5;

    private static String hexify(byte[] inp) {
        StringBuilder hexString = new StringBuilder();
        for (int i = 0; i < inp.length; i++) {
            hexString.append(String.format("%02x", inp[i]));
        }
        return hexString.toString();
    }

    private static byte[] bytify(String hexInp) {
        byte[] val = new byte[hexInp.length() / 2];

        for (int i = 0; i < val.length; i++) {
            int index = i * 2;
            int j = Integer.parseInt(hexInp.substring(index, index + 2), 16);
            val[i] = (byte) j;
        }
        return val;
    }

    
    public static void main(String[] args) throws NoSuchAlgorithmException {

        String[] salts = new String[MAX_PW];
        String[] hashes = new String[MAX_PW];

        String[] passwords = {"s3cr3t", "pass", "foobar", "admin", "whereintheworldiscarmensandiego"};
        int numHashes = 0;

        for (int i = 0; i < MAX_PW; i++) {
            SecureRandom random = new SecureRandom();
            byte[] salt = new byte[16];
            random.nextBytes(salt);

            MessageDigest md = MessageDigest.getInstance("SHA-256");
            md.update(salt);
            byte[] digest = md.digest(passwords[i].getBytes());

            salts[numHashes] = hexify(salt);
            hashes[numHashes] = hexify(digest);
            numHashes++;

            System.out.println(passwords[i] + " " + salts[i] + " (" + salts[i].length() + ") " +
                    hashes[i] + " (" + hashes[i].length() + ")");
        }
        Scanner in = new Scanner(System.in);
        String test = in.nextLine();
        for (int i = 0; i < MAX_PW; i++) {
            byte[] salt = bytify(salts[i]);
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            md.update(salt);
            byte[] digest = md.digest(test.getBytes());
            String compare = hexify(digest);
            if (compare.equals(hashes[i])) {
                System.out.println("Found: " + passwords[i]);
            }
        }
    }
}
