package net.prachit.dsa.Strings;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GenerateParenthesisTest {

    private GenerateParenthesis generateParenthesis;

    @BeforeEach
    void setUp() {
        generateParenthesis = new GenerateParenthesis();
    }

    @Test
    void generate() {
        System.out.println(generateParenthesis.generate(2));
    }
}