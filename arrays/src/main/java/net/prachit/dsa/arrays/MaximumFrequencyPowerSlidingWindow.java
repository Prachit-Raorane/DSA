package net.prachit.dsa.arrays;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * https://www.geeksforgeeks.org/maximize-sum-of-each-element-raised-to-power-of-its-frequency-in-k-sized-subarray/
 */
public class MaximumFrequencyPowerSlidingWindow {

    public int max(int[] nums,int k){

        int max=0;
        Map<Integer,Long> frequency = Arrays
                .stream(nums)
                .limit(k)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        max = (int)frequency.entrySet()
                .stream()
                .filter(entry -> entry.getValue()!=0)
                .mapToDouble(entry -> Math.pow(entry.getKey(),entry.getValue()))
                .sum();

        int windowSum;
        for(int i=k ; i<nums.length;i++){
            frequency.compute(nums[i],(integer, aLong) -> aLong == null ? 1L : aLong++);
            frequency.computeIfPresent(nums[i-k],(integer, aLong) -> aLong==1 ? null : aLong--);


            windowSum = (int)frequency.entrySet()
                    .stream()
                    .filter(entry -> entry.getValue()!=0)
                    .mapToDouble(entry -> Math.pow(entry.getKey(),entry.getValue()))
                    .sum();

            max = Math.max(max,windowSum);
        }
        return max;
    }
}
