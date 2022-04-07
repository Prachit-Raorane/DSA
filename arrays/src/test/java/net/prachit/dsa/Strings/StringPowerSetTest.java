package net.prachit.dsa.Strings;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StringPowerSetTest {

    private StringPowerSet stringPowerSet;

    @BeforeEach
    void setUp() {
        stringPowerSet = new StringPowerSet();
    }

    @Test
    void printPowerSet() {
        stringPowerSet.printPowerSet("ABC",0,"");
    }
}