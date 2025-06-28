// File: src/test/java/org/sample/PrimeFinderTest.java
package org.sample;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PrimeFinderTest {

    @Test
    void testNegativeNumbers() {
        assertFalse(PrimeFinder.isPrime(-10));
        assertFalse(PrimeFinder.isPrime(-1));
    }

    @Test
    void testZeroAndOne() {
        assertFalse(PrimeFinder.isPrime(0));
        assertFalse(PrimeFinder.isPrime(1));
    }

    @Test
    void testSmallPrimes() {
        assertTrue(PrimeFinder.isPrime(2));
        assertTrue(PrimeFinder.isPrime(3));
        assertTrue(PrimeFinder.isPrime(5));
        assertTrue(PrimeFinder.isPrime(7));
    }

    @Test
    void testSmallNonPrimes() {
        assertFalse(PrimeFinder.isPrime(4));
        assertFalse(PrimeFinder.isPrime(6));
        assertFalse(PrimeFinder.isPrime(8));
        assertFalse(PrimeFinder.isPrime(9));
        assertFalse(PrimeFinder.isPrime(10));
    }

    @Test
    void testLargerPrime() {
        assertTrue(PrimeFinder.isPrime(97));
    }

    @Test
    void testLargerNonPrime() {
        assertFalse(PrimeFinder.isPrime(100));
    }
}