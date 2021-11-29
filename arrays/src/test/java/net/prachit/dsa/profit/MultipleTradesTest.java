package net.prachit.dsa.profit;

import org.junit.jupiter.api.Test;

class MultipleTradesTest {

    private final MultipleTrades multipleTrades = new MultipleTrades();

    @Test
    void testProfit() {
        multipleTrades.profit(new int[]{100, 180, 260, 310, 40, 535, 695});
    }

    //{2,8,4,5,7,6}
}