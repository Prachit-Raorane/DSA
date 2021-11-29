package net.prachit.dsa.misc;

import java.math.BigInteger;

public class NthFibonacci {


    public BigInteger nthFibonacci(int n) {

        BigInteger[] table = new BigInteger[n + 1];
        table[0] = BigInteger.ONE;
        table[1] = BigInteger.ONE;
        table[2] = BigInteger.ONE;
        return fibonacci(n, table);
    }

    private BigInteger fibonacci(int n, BigInteger[] table) {

        if (null !=table[n] &&  !table[n].equals(BigInteger.ZERO)) {
            return table[n];
        }

        if (n <= 2) {
            return BigInteger.ONE;
        }
        table[n] = fibonacci(n - 1, table).add(fibonacci(n - 2, table));
        return table[n];
    }
}
