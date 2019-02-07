/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rsa.primes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author cenuser
 */
public class Primes {

    private static final int MAX_P = 30000;
    private static final boolean[] isPrime = new boolean[MAX_P];

    static {
        Arrays.fill(isPrime, true);
        for (int p = 2; p * p < MAX_P; p++) {
            if (isPrime[p]) {
                for (int i = p * 2; i < MAX_P; i += p) {
                    isPrime[i] = false;
                }
            }
        }
    }
    
    public static List<Integer> getPrimes(int lo, int hi) {
        List<Integer> primes = new ArrayList<>();
        for (int i = lo; i <= hi; i++) {
            if (isPrime[i]) {
                primes.add(i);
            }
        }
        return primes;
    }

}
