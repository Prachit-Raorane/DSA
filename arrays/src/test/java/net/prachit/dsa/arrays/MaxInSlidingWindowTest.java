package net.prachit.dsa.arrays;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

class MaxInSlidingWindowTest {

    private MaxInSlidingWindow maxInSlidingWindow = new MaxInSlidingWindow();
    @Test
    void maxSlidingWindow() {

        Arrays.stream(maxInSlidingWindow.maxSlidingWindow(new int[]{1,3,-1,-3,5,3,6,7},3)).forEach(System.out::println);
    }
}