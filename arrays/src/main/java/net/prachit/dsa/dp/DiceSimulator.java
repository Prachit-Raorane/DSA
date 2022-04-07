package net.prachit.dsa.dp;

import java.util.Arrays;

public class DiceSimulator {

    public int solution(int n){
        int [][] dp = new int[6][n];

        //Only 1 round is played
        for (int i = 0; i < 6; i++) {
            dp[i][0] = 1;
        }

        for(int i =0; i<n;i++){
            for (int j=0;j<6;j++){
                dp[i][j] = Arrays.stream(dp[i-1]).sum();
            }
        }

        return Arrays.stream(dp[n-1]).sum();
    }
}
