package net.prachit.dsa.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MaximumFrequencyPowerSlidingWindowTest {

    private final MaximumFrequencyPowerSlidingWindow max =  new MaximumFrequencyPowerSlidingWindow();
    @Test
    void max() {
        Assertions.assertEquals(20,max.max(new int[]{ 4, 9, 6, 5},3));
    }
}