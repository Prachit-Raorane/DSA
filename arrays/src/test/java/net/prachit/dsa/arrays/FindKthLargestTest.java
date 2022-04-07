package net.prachit.dsa.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FindKthLargestTest {

    private final FindKthLargest findKthLargest = new FindKthLargest();

    @Test
    void findKthLargest() {
        Assertions.assertEquals(4,findKthLargest.findKthLargest(new int[]{3,2,3,1,2,4,5,5,6},4));
    }
}