package net.prachit.dsa.Strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PalindromeStringTest {

    private PalindromeString palindromeString;

    @BeforeEach
    void setUp() {
        palindromeString = new PalindromeString();
    }

    @Test
    void isPalindrome() {
        Assertions.assertTrue(palindromeString.isPalindrome("ABA",0,2));
        Assertions.assertFalse(palindromeString.isPalindrome("ABAC",0,3));
    }
}