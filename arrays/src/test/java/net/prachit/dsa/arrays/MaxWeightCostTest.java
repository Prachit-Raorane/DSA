package net.prachit.dsa.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MaxWeightCostTest {


    private final MaxWeightCost maxWeightCost = new MaxWeightCost();

    @Test
    void maxCost() {
        int W[] = { 9, 7, 6, 5, 8, 4 };
        int C[] = { 7, 1, 3, 6, 8, 3 };
        int K = 20;

        Assertions.assertEquals(17,maxWeightCost.maxCost(W, C, K));
    }
}