package net.prachit.dsa.profit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SingleTradeTest {

    private final SingleTrade singleTrade = new SingleTrade();
        @Test
        public void testProfit(){
            Assertions.assertEquals(8, singleTrade.profit(new int[]{2, 3, 10, 6, 4, 8, 1}));
            Assertions.assertEquals(2, singleTrade.profit(new int[]{7, 9, 5, 6, 3, 2}));
    }
}