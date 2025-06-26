package org.sample;

import java.util.ArrayList;
import java.util.List;

public class PrimeFinder {
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static List<Integer> every1000thPrime() {
        List<Integer> primes = new ArrayList<>();
        int num = 2;
        while (primes.size() < 10000) {
            if (isPrime(num)) {
                primes.add(num);
            }
            num++;
        }
        List<Integer> result = new ArrayList<>();
        for (int i = 999; i < 10000; i += 1000) {
            result.add(primes.get(i));
        }
        return result;
    }

    public static void main(String[] args) {
        long startTime = System.nanoTime();
        List<Integer> primes = every1000thPrime();
        for (int prime : primes) {
            System.out.println(prime);
        }
        long endTime = System.nanoTime();
        double elapsedTime = (endTime - startTime) / 1_000_000_000.0;
        System.out.printf("Time taken: %.10f seconds%n", elapsedTime);
    }
}
