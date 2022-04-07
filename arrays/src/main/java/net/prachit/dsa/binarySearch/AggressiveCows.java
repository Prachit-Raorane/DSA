package net.prachit.dsa.binarySearch;

import java.util.Arrays;

public class AggressiveCows {

    public long solution(long [] stalls, int cows){

        Arrays.sort(stalls);

        long low=stalls[0],high= stalls[stalls.length-1],minDistance=0,mid;

        while (low <=high){
            mid = ( high + low)/2;
            // T T T T T F F F
            if(checkPossibility(mid,stalls,cows)){
                minDistance = mid;
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }

        return minDistance;
    }

    private boolean checkPossibility(long distance, long[] stalls, int cows) {
        long pos = stalls[0];
        long numberCowsPlaced = 1L;
        for (int i = 1; i < stalls.length; i++) {
            if(stalls[i] - pos >= distance){
                pos = stalls[i];
                numberCowsPlaced ++;
            }
        }

        return cows <= numberCowsPlaced;
    }
}
