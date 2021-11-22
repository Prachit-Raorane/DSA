package net.prachit.dsa.profit;

import java.util.ArrayList;
import java.util.List;

public class MultipleTrades {


    public void profit(int[] prices) {
        List<Interval> solutions = new ArrayList<>();
        if (prices.length == 1) {
            return;
        }

        int i = 0;

        int length = prices.length - 1;
        while (i < length) {

            while (i < length && prices[i + 1] <= prices[i]) {
                i++;
            }

            if (i == length) {
                break;
            }

            final Interval interval = new Interval();
            interval.buy = i++;

            while(i< prices.length && prices[i] >= prices[i-1]){
                i++;
            }
            interval.sell= i-1;

            solutions.add(interval);
        }

        solutions.forEach(System.out::println);
    }

    class Interval {
        int buy;
        int sell;

        @Override
        public String toString() {
            return "Interval{" +
                    "buy=" + buy +
                    ", sell=" + sell +
                    '}';
        }
    }
}
