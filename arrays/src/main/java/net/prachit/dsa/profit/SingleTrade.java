package net.prachit.dsa.profit;

public class SingleTrade {
    public int profit(int[] prices) {

        int minimum = prices[0];
        int maxProfit = prices[1]-prices[0];

        for (int i = 0; i < prices.length; i++) {
            if(prices[i]-minimum > maxProfit){
                maxProfit = prices[i] - minimum;
            }
            if(prices[i] < minimum){
                minimum = prices[i];
            }
        }
        return maxProfit;
    }
}
