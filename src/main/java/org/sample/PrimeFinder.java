package org.sample;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class PrimeFinder {
    private static final Map<Integer, Boolean> cache = new ConcurrentHashMap<>();

    public static boolean isPrime(int n) {
        if (cache.containsKey(n)) {
            return cache.get(n);
        }
        boolean result;
        if (n <= 1) result = false;
        else if (n == 2) result = true;
        else if (n % 2 == 0) result = false;
        else {
            int sqrt = (int) Math.sqrt(n);
            result = true;
            for (int i = 3; i <= sqrt; i += 2) {
                if (n % i == 0) {
                    result = false;
                    break;
                }
            }
        }
        cache.put(n, result);
        return result;
    }


    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        runtime.gc(); // Suggest garbage collection

        long beforeUsedMem = runtime.totalMemory() - runtime.freeMemory();

        int count = 0;
        long start = System.currentTimeMillis();
        for (int i = 1; i <= 100_000_000; i++) {
            if (isPrime(i)) {
                count++;
            }
        }
        long end = System.currentTimeMillis();

        long afterUsedMem = runtime.totalMemory() - runtime.freeMemory();
        long actualMemUsed = afterUsedMem - beforeUsedMem;

        System.out.println("Primes found: " + count);
        System.out.println("Time taken: " + (end - start) + " ms");
        System.out.println("Memory used: " + (actualMemUsed / (1024 * 1024)) + " MB");
    }
}
