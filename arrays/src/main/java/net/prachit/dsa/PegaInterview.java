package net.prachit.dsa;

import java.util.Arrays;

public class PegaInterview {

    public long countZeroes(final int[] input){

        return Arrays.stream(input)
                .boxed()
                .filter(i -> i ==0)
                .count();
    }
}
