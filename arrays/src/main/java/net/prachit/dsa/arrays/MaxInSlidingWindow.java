package net.prachit.dsa.arrays;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class MaxInSlidingWindow {

    public int[] maxSlidingWindow(int[] nums, int k) {
        List<Integer> list = new ArrayList<>();
        Deque<Integer> dq = new LinkedList<>();
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            count++;
            // If the current element is greater than the last inserted element in the deque
            // then remove the smaller elements in the deque from last
            while(!dq.isEmpty() && nums[i] > nums[dq.peekLast()]){
                dq.removeLast();
            }
            // add the current element to the deque
            dq.add(i);
            // remove the elements from the front if they don't fall under the current window
            while(!dq.isEmpty() && dq.peekFirst() < i-k+1){
                dq.removeFirst();
            }
            if(count == k){    //if the count of iterated elements are same as the window size
                list.add(nums[dq.peekFirst()]);
                count--;
            }
        }
        // convert list to int array
        return list.stream().mapToInt(i -> i).toArray();
    }
}
