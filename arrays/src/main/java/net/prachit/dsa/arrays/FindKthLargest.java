package net.prachit.dsa.arrays;

import java.util.PriorityQueue;

/**
 * https://leetcode.com/problems/kth-largest-element-in-an-array/submissions/
 */
public class FindKthLargest {

    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        //maintain a min heap with fixed k size
        for(int value: nums){
            queue.offer(value);
            if(queue.size() > k){
                queue.poll();
            }
        }
        return queue.peek();
    }
}
