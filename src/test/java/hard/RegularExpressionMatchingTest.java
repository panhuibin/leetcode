package hard;

import org.junit.Test;

import static org.junit.Assert.*;

public class RegularExpressionMatchingTest {
    RegularExpressionMatching r = new RegularExpressionMatching();

    @Test
    public void isMatch() {
        assertFalse(r.isMatch("aab","b*c*"));
        assertFalse(r.isMatch("aa","b*"));
        assertFalse(r.isMatch("aa","a"));
        assertTrue(r.isMatch("abaaaa","ab.*a"));
        assertTrue(r.isMatch("aa","a*"));
        assertTrue(r.isMatch("ab",".*"));
        assertFalse(r.isMatch("aab","c*a*b"));
        assertTrue(r.isMatch("mississippi","mis*is*p*."));
    }
}