package net.prachit.dsa.arrays;

public class MaxProductSubArray {

    public int maxProduct(int[] nums) {

        int max = nums[0];
        int min = nums[0];
        int temp ;
        int answer = nums[0];
        for(int index =1; index< nums.length ; index ++){
            temp = max;
            max = Math.max(Math.max(nums[index],temp*nums[index]),min*nums[index]);
            min = Math.min(Math.min(nums[index],temp*nums[index]),min*nums[index]);

            if(max > answer){
                answer = max;
            }
        }

        return answer;
    }
}
