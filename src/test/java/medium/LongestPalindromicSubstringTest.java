package medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class LongestPalindromicSubstringTest {

    @Test
    public void longestPalindrome() {
        LongestPalindromicSubstring longestPalindromicSubstring = new LongestPalindromicSubstring();
        assertEquals(longestPalindromicSubstring.longestPalindrome("abb"),"bb");
        assertEquals(longestPalindromicSubstring.longestPalindrome("abc"),"a");
        assertEquals(longestPalindromicSubstring.longestPalindrome("ccc"),"ccc");
        assertEquals(longestPalindromicSubstring.longestPalindrome("abcdcba"),"abcdcba");
        assertEquals(longestPalindromicSubstring.longestPalindrome("abcdefgfe"),"efgfe");
        assertEquals(longestPalindromicSubstring.longestPalindrome("ebcbaabef"),"baab");
        assertEquals(longestPalindromicSubstring.longestPalindrome("aa"),"aa");
        assertEquals(longestPalindromicSubstring.longestPalindrome("ab"),"a");
        assertEquals(longestPalindromicSubstring.longestPalindrome("aba"),"aba");
        assertEquals(longestPalindromicSubstring.longestPalindrome("aba"),"aba");
        assertEquals(longestPalindromicSubstring.longestPalindrome("cbbd"),"bb");
        assertEquals(longestPalindromicSubstring.longestPalindrome("babad"),"bab");
    }
}