package net.prachit.dsa.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MaximumSumSubArrayTest {

    public static final MaximumSumSubArray maximum = new MaximumSumSubArray();

    @Test
    void maxSubArray() {
        Assertions.assertEquals(24, maximum.maxSubArray(new int[]{ 1, 4, 2, 10, 2, 3, 1, 0, 20 },  4));
        Assertions.assertEquals(39, maximum.maxSubArray(new int[]{1, 4, 2, 10, 23, 3, 1, 0, 20},  4));
    }
}