package net.prachit.dsa.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MaxProductSubArrayTest {

    private MaxProductSubArray maxProductSubArray = new MaxProductSubArray();
    @Test
    void maxProduct() {
        Assertions.assertEquals(12,maxProductSubArray.maxProduct(new int[]{-4,-3,-2}));
    }
}