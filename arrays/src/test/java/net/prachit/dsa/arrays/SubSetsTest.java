package net.prachit.dsa.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SubSetsTest {

    private SubSets subSets;

    @BeforeEach
    void setUp() {
        subSets = new SubSets();
    }

    @Test
    void subsetUsingBits() {
        Assertions.assertEquals(8, subSets.subsetUsingBits(new int[]{1,2,3}).size());
        Assertions.assertEquals(8, subSets.subsetsBackTrack(new int[]{1,2,3}).size());
    }
}