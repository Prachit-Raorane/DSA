package net.prachit.dsa.arrays;

/**
 * https://www.geeksforgeeks.org/maximize-cost-of-segment-having-weight-at-most-k-from-given-weight-and-cost-of-n-items/
 */
public class MaxWeightCost {

    public int maxCost(int w[], int c[],int k){
        int maxCost =0 , weight = 0, cost =0;

        int weightIndex = 0;


        for (int i =0;i<w.length;i++){
            weight+=w[i];
            cost+=c[i];

            while (weight > k){
                weight-=w[weightIndex];
                cost-=c[weightIndex];
                weightIndex++;
            }

            maxCost = Math.max(cost,maxCost);
        }

        return maxCost;

    }
}
