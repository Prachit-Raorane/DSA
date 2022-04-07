package net.prachit.dsa.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ArrayInterSection {


    public int[] intersect(int[] nums1, int[] nums2) {

        List<Integer> result = new ArrayList<>();
        Map<Integer,Long> nums1Frequency =

                Arrays.stream(nums1).boxed().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        for(int num : nums2){
            if(nums1Frequency.containsKey(num) && nums1Frequency.get(num)>0){
                result.add(num);
                nums1Frequency.put(num,nums1Frequency.get(num)-1);
            }
        }


        return result.stream().mapToInt(value -> value).toArray();
    }
}
