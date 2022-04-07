package net.prachit.dsa.backtracking;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class NQueensTest {

    private NQueens nQueens;

    @BeforeEach
    void setUp() {
        nQueens = new NQueens();
    }

    @Test
    void NQueen() {
        nQueens.NQueen(6);
    }
}