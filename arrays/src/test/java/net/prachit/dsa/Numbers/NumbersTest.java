package net.prachit.dsa.Numbers;

import net.prachit.dsa.numbers.Numbers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class NumbersTest {

    private Numbers numbers;

    @BeforeEach
    void setUp() {
        numbers = new Numbers();
    }

    @Test
    void palindrome() {

        Assertions.assertTrue(numbers.palindrome(404));
        Assertions.assertFalse(numbers.palindrome(4040));
    }

    @Test
    void countPrimesTest(){
        Assertions.assertEquals(4,numbers.countPrimes(10));
    }


    @Test
    void gcdTest(){
        Assertions.assertEquals(3,numbers.gcd(27,15));
    }

    @Test
    void fastPowerTest(){
        Assertions.assertEquals(9,numbers.fastPower(3,2));
        Assertions.assertEquals(243,numbers.fastPower(3,5));
    }

    @Test
    void rootTest(){
        Assertions.assertEquals(5,numbers.squareRoot(25));
        Assertions.assertEquals(3,numbers.squareRoot(15));
        Assertions.assertEquals(5,numbers.squareRoot(29));
        Assertions.assertEquals(15,numbers.squareRoot(225));
        Assertions.assertEquals(173,numbers.squareRoot(((int) Math.pow(173, 2))));
    }

    @Test
    void nThRootTest(){
        Assertions.assertTrue(1.41421- numbers.nThRoot(2,2) < 1e-6);
        Assertions.assertTrue(2.0- numbers.nThRoot(4,2) < 1e-6);
        Assertions.assertTrue(5.76772 - numbers.nThRoot(212341,7) < 1e-6);
    }
}