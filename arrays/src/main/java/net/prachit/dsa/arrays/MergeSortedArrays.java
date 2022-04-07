package net.prachit.dsa.arrays;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.stream.Collectors;

public class MergeSortedArrays {

    public int[] merge(int[] nums1, int m, int[] nums2, int n) {

        int[] merged = new int[m+n];
        Queue<Integer> queue = new PriorityQueue<>();

        queue.addAll(Arrays.stream(nums1).filter(num -> num != 0).boxed().toList());
        queue.addAll(Arrays.stream(nums2).filter(num -> num != 0).boxed().toList());

        int i=0;
        while(!queue.isEmpty()){
            merged[i] = queue.poll();
            i++;
        }

        return merged;
    }
}
