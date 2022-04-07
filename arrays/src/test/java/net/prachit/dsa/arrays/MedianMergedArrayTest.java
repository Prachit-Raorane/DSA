package net.prachit.dsa.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MedianMergedArrayTest {

    private final MedianMergedArray medianMergedArray = new MedianMergedArray();

    @Test
    void findMedianSortedArrays() {
        Assertions.assertEquals(2,medianMergedArray.findMedianSortedArrays(new int[]{1,3},new int[]{2}));
        Assertions.assertEquals(2.5,medianMergedArray.findMedianSortedArrays(new int[]{1,2},new int[]{3,4}));
    }
}