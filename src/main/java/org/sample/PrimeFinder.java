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

    public static void main(String[] args) {
        // todo: add benchmarking code for isPrime method
    }
}
