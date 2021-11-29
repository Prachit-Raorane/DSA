package net.prachit.dsa.misc;

import java.util.*;

public class ArrayAdder {

    public boolean canSum(int sum, int[] nums){

        boolean flag = false;
        if (sum < 0 ) return false;
        if (sum == 0) return true;

        for (int num : nums) {
            int remainder = sum -num;
            if (canSum(remainder,nums)) {
                flag = true;
                break;
            }
        }

        return flag;
    }

    public int numberOfWaysToAdd(int sum,int[] nums){

        int count = 0;
        if(sum < 0) return 0;
        if(sum == 0) return 1;

        for (int num : nums) {
            int remainder = sum -num;
            count += numberOfWaysToAdd(remainder,nums);
        }

        return count;
    }

    public List<Integer> howSum(int sum, int[] nums){
        List<Integer> output = Collections.emptyList();
        if (sum == 0) return new ArrayList<>();
        if (sum < 0 ) return null;
        for (int num : nums) {
            int remainder = sum - num;
            output = howSum(remainder,nums);
            if(null != output){
                output.add(num);
                break;
            }
        }

        return output;
    }


    public int[] shortestCombination(int sum, int[] numbers){
        if (sum == 0 ) return new int[0];
        if (sum < 0) return null;

        int[] shortestCombination = null;

        for (int number : numbers) {
            int remainder = sum - number;
            int [] combination = shortestCombination(remainder,numbers);
            if (combination!= null ){
                int[] temp = Arrays.copyOf(combination,combination.length+1);
                temp[temp.length-1] = number;
                if(shortestCombination ==null || shortestCombination.length > temp.length){
                    shortestCombination = temp;
                }
            }
        }
        List<Integer> weights = Arrays.asList(2,4,5);
        Queue<Integer> queue  = new PriorityQueue(weights.size(),Comparator.reverseOrder());
        for (Integer weight : weights) {
            queue.add(weight);
        }
            return shortestCombination;
    }
}
