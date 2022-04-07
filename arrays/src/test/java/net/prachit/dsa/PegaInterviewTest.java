package net.prachit.dsa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PegaInterviewTest {


    @Test
    void countZeroes() {

        PegaInterview pegaInterview = new PegaInterview();

        Assertions.assertEquals(2L, pegaInterview.countZeroes(new int[]{1,2,3,0,1,2,3,0}));
    }
}