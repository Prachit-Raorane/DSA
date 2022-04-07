package net.prachit.dsa.arrays;

public class MaximumSumSubArray {

    public int maxSubArray(int [] nums,int k){

        int maxSum = 0;

        for(int i=0; i< k; i++){
            maxSum+=nums[i];
        }

        int windowSum = maxSum;

        for(int i=k ; i<nums.length ; i++){
            windowSum = windowSum + nums[i] - nums[i-k];
            maxSum = Math.max(maxSum,windowSum);
        }

        return maxSum;
    }
}
