package net.prachit.dsa.arrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;

public class EfficientJanitor {
    private static final double[] weights = {1.99, 1.01, 2.5, 1.5, 1.01};
    private static final double maxBagSize = 3.0;

    //find min trips to throw the bags
    public static void main(String[] args) {
        //trying greedy approach
        Arrays.sort(weights);

        int bagCount = 0; //or trip count
        double currBagWeight = 0.0;
        int s = 0, e = weights.length - 1;
        while(s <= e) {
            if(weights[e] > maxBagSize) throw new RuntimeException("Weight is beyond bag limit");
            else {
                boolean inLoop = false;
                if(currBagWeight + weights[e] < maxBagSize) {
                    currBagWeight += weights[e];
                    e--;
                    inLoop = true;
                }
                if(currBagWeight + weights[s] < maxBagSize) {
                    currBagWeight += weights[s];
                    s++;
                    inLoop = true;
                }
                if(!inLoop) {
                    bagCount++;
                    currBagWeight = 0.0;
                }
            }
        }
        System.out.println(bagCount);

    }

}

