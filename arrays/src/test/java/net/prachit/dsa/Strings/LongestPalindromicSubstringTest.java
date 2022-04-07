package net.prachit.dsa.Strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LongestPalindromicSubstringTest {

    private final LongestPalindromicSubstring longestPalindromicSubstring = new LongestPalindromicSubstring();

    @Test
    void longestPalindrome() {
        Assertions.assertEquals("bb",longestPalindromicSubstring.longestPalindrome("bb"));
    }
}