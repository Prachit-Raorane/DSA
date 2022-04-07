package net.prachit.dsa.arrays;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

class MergeSortedArraysTest {

    private MergeSortedArrays mergeSortedArrays = new MergeSortedArrays();
    @Test
    void merge() {
        Arrays.stream(mergeSortedArrays.merge(new int[]{1,2,3,0,0,0},3,new int[]{2,5,6},3)).forEach(System.out::println);

    }
}