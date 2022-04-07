package net.prachit.dsa.arrays;

import java.util.ArrayList;
import java.util.List;

public class SubSets {

    List<List<Integer>> allSets = new ArrayList<>();
    public List<List<Integer>> subsetUsingBits (int [] numbers){
        int size = numbers.length;
        int subsetSize = 1<< size;
        List<List<Integer>> result = new ArrayList<>();
        for(int mask=0 ; mask < subsetSize ; mask ++){
            List<Integer>  temp = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                if((mask & 1<<i) != 0 ){
                    temp.add(numbers[i]);
                }
            }
            result.add(temp);
        }
        System.out.println(result);
        return result;

    }

    public List<List<Integer>> subsetsBackTrack(int [] numbers){

       int n = numbers.length;
        for (int k = 0; k < n + 1; ++k) {
            backtrack(0, new ArrayList<>(), numbers,k);
        }
        System.out.println(allSets);
        return allSets;
    }

    public void backtrack(int index, ArrayList<Integer> subset, int[] numbers,int currentSize) {
        // if the combination is done
        if (subset.size() == currentSize) {
            allSets.add(new ArrayList(subset));
            return;
        }
        for (int i = index; i < numbers.length; i++) {
            // add i into the current combination
            subset.add(numbers[i]);
            // use next integers to complete the combination
            backtrack(i + 1, subset, numbers,currentSize);
            // backtrack
            subset.remove(subset.size() - 1);
        }
    }
}
