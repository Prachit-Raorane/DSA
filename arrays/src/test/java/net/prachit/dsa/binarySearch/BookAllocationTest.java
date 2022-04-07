package net.prachit.dsa.binarySearch;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookAllocationTest {

    private BookAllocation bookAllocation;

    @BeforeEach
    void setUp() {
        bookAllocation = new BookAllocation();
    }

    @Test
    void solution() {

        Assertions.assertEquals(20,bookAllocation.solution(new int[]{5,10,20},2));
        Assertions.assertEquals(60,bookAllocation.solution(new int[]{10,20,30,40},2));
    }
}