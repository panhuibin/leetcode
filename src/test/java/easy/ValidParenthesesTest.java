package easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class ValidParenthesesTest {
    ValidParentheses v = new ValidParentheses();

    @Test
    public void isValid() {
        assertTrue(v.isValid("()"));
        assertTrue(v.isValid("()[]{}"));
        assertFalse(v.isValid("(]"));
        assertFalse(v.isValid("([)]"));
        assertTrue(v.isValid("{[]}"));
    }
}