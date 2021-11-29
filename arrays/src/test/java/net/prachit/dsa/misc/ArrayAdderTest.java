package net.prachit.dsa.misc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ArrayAdderTest {

    private final ArrayAdder ad = new ArrayAdder();
    @Test
    void canSum() {
        assertTrue(ad.canSum(7, new int[]{7}));
        assertTrue(ad.canSum(21, new int[]{1,2,99, 109 ,1000}));
    }

    @Test
    void numberOfWaysToAdd() {
        Assertions.assertEquals(1,ad.numberOfWaysToAdd(7, new int[]{7}));
        Assertions.assertEquals(44,ad.numberOfWaysToAdd(7, new int[]{4,2,3}));
    }

    @Test
    void howSumTest(){
        System.out.println(ad.howSum(5,new int[]{1,3,2}));
    }

    @Test
    void ShortestCombinationTest(){
        Assertions.assertArrayEquals(new int[]{7},ad.shortestCombination(7, new int[]{5, 3, 4, 7}));
        //Assertions.assertArrayEquals(new int[]{3,5},ad.shortestCombination(8, new int[]{2,3,5}));
        Assertions.assertArrayEquals(new int[]{4,4},ad.shortestCombination(8, new int[]{1,4,5}));
    }
}