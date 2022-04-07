package net.prachit.dsa.arrays;

import net.prachit.dsa.binarySearch.AggressiveCows;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AggressiveCowsTest {

    private AggressiveCows aggressiveCows;

    @BeforeEach
    void setUp() {
        aggressiveCows = new AggressiveCows();
    }

    @Test
    void solution() {

        Assertions.assertEquals(3,aggressiveCows.solution(new long[]{1,2,8,4,9},3));
    }
}