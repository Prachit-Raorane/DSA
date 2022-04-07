package net.prachit.dsa.binarySearch;

//https://www.spoj.com/problems/EKO/
public class EKO {

    public long solution(int required,int[] trees){

        long low=0,high=10000000,mid;

        while (high - low > 1){
            mid = (high+low) /2;
            // T T T T T F F F F F
            if(isWoodAvailable( mid,required,trees)){
                low = mid;
            }else {
                high = mid -1;
            }
        }

        if(isWoodAvailable(high,required,trees)){
            return high;
        }else{
            return low;
        }
    }

    private boolean isWoodAvailable(long height, int required, int[] trees) {
        long collected = 0L;
        for (int tree : trees) {
            if (tree > height){
                collected += tree - height;
            }
        }

        return collected>=required;
    }
}
