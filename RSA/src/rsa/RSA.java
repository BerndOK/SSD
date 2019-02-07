/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rsa;

import java.util.List;
import java.util.Random;
import rsa.primes.Primes;

/**
 *
 * @author cenuser
 */
public class RSA {

    static class Pair<S,T> {
        private final S first;
        private final T second;
        public Pair (S first, T second) {
            this.first = first;
            this.second = second;
        }
        public S getFirst() {
            return first;
        }
        public T getSecond() {
            return second;
        }
    }
    
    private static int gcd(int a, int b)
    {
    while (a != b)
    { 
        if (a > b) a -= b; else b -= a;
    }
    return a;
}

    private static int lcm(int a, int b)
    {
        return (a * b) / gcd(a, b);
    }
    
    private static Pair<Integer,Integer> twoPrimes(int lo, int hi) {
        List<Integer> primes = Primes.getPrimes(lo,hi);
        int num = primes.size();
        int half = num/2;
        Random rand = new Random();
        int index1 = rand.nextInt(half);
        int index2 = rand.nextInt(half);
        return new Pair<Integer,Integer>(primes.get(index1),primes.get(half+index2));
    }
        
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pair<Integer,Integer> twoPrimes = twoPrimes(10000,29999);
        // Pair<Integer,Integer> twoPrimes = new Pair<>(5,11);
        int p = twoPrimes.getFirst();
        int q = twoPrimes.getSecond();
        int n = p*q;
        int r = (p-1)*(q-1);
        int e;
        for (e = 3; e < n; e+=2) {
            if (r%e != 0) break;
        }
        System.out.print(p + " " + q + " " + n + " " + r + " " + e + " ");
        int l = lcm(p-1,q-1);
        System.out.print(l + " ");
        int d = 1;
        while ((d*e)%l != 1) d++;
        System.out.print(d + " ");
        
        // 163 269 43847 43416 5 21708 13025
        // 1776 --> 14380
    }
    
}
