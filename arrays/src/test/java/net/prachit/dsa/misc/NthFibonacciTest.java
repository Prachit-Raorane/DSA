package net.prachit.dsa.misc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.*;

class NthFibonacciTest {

    private final NthFibonacci nthFibonacci = new NthFibonacci();
    @Test
    void nthFibonacci() {
        Assertions.assertEquals(BigInteger.valueOf(13),nthFibonacci.nthFibonacci(7));
        Assertions.assertEquals(BigInteger.valueOf(21),nthFibonacci.nthFibonacci(8));
        Assertions.assertEquals(BigInteger.valueOf(34),nthFibonacci.nthFibonacci(9));

        System.out.println(nthFibonacci.nthFibonacci(51));
    }
}