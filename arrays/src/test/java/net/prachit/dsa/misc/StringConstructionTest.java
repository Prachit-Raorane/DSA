package net.prachit.dsa.misc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class StringConstructionTest {

    private final StringConstruction stringConstruction = new StringConstruction();
    @Test
    void canConstruct() {
        assertTrue(stringConstruction.canConstruct("abcdef", new String[]{"ab", "bc", "abc", "def"}));
        assertFalse(stringConstruction.canConstruct("skateboard", new String[]{"bo", "rd", "ate", "t", "ska", "sk","boar"}));
        assertTrue(stringConstruction.canConstruct("skateboard", new String[]{"bo", "rd", "te", "t", "ska", "sk","boa"}));
    }

    @Test
    void numberOfWaysToConstruct() {
        Assertions.assertEquals(1,stringConstruction.numberOfWaysToConstruct("abcdef", new String[]{"ab", "bc", "abc", "def"}));
        Assertions.assertEquals(2,stringConstruction.numberOfWaysToConstruct("purple", new String[]{"purp", "p", "ur", "le","purpl"}));
    }
}