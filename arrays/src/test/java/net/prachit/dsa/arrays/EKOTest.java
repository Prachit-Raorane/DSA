package net.prachit.dsa.arrays;

import net.prachit.dsa.binarySearch.EKO;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EKOTest {

    private EKO eko;

    @BeforeEach
    void setUp() {
        eko = new EKO();
    }

    @Test
    void solution() {
        Assertions.assertEquals(15,eko.solution(7,new int[]{20,15,10,17}));
    }
}