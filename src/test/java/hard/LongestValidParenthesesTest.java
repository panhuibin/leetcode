package hard;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LongestValidParenthesesTest {
    LongestValidParentheses l = new LongestValidParentheses();

    @Test
    public void longestValidParentheses() throws Exception {
        String s = "()()()(()))()()())))((()()()(()()))(()()()((()()))())(((())()())(()(()(()(())(((()())()))(()))()))))()())(()))))()()(())()()((())()()))))((()))))(()()((()(()(()())((())()()()()))()()()(())()()())((((()(())())))(((()(((()((((())())(()()()()(((((()))()(()(())))(((()()()()(()(((())(()(()()(()(()(())()))))))()))()())((()((((()(())(()()()(((((()())()))))())))((((()()()(()(())(((())(((()()((()((()(((()(()))(((())(((()((((()(())(((()((()(()())))))(()(()()(())))))()(()()((()))()))())())((())))()(())((((()((()))))()())()))((()(()())()())()()((()))())(()(()(())((((((()()((((())))())(((()()())))()(((()(()()((((())))))()()((((()(()()())(()(())()()()((()(()((((())))((((((())(()())()))))(()(()))()))))))(()()((()()()())(())))(((()))(()()()(()))((())()()()())()()(((())(()(())()()(()())((()()(((((())(()((((()(()()()(()))(()((((())()())()())())))())(((()(()((())()()((((()()()()))))))())())()(((((()())()(()()()()()(((())((((((()))(())()(()())(()(()())(()(())))())))(()()(()((((()()(())(()))()))(()))(()())())()))))))()()(())))))()))()(()())))((())(()()))()((()))()(())()()((((())()))((()(()))()(((()())()(()()((()())((((())()))))()(())())())())(((()(()())))((()))))()())))))(()((())))()())((()))()()))(())())()))()()((()(((())()()()((()()(()(())(()))())())(((()())(()())(()((()()()())()(()(((((((()()(((()(((((((())(()))))())()))))))))()(()(()((((())(()()(((()))()(())(((((((((()(()())())()(((()((()(((()(()()(()))(())))))))(((";
        int num = l.longestValidParentheses(s);
        assertEquals(num, 1192);
    }

    @Test
    public void longestValidParentheses2() throws Exception {
        String s = ")()())";
        int num = l.longestValidParentheses(s);
        assertEquals(num, 4);
    }


    @Test
    public void longestValidParentheses3() throws Exception {
        String s = "()(()";
        int num = l.longestValidParentheses(s);
        assertEquals(num, 2);
    }

    @Test
    public void longestValidParentheses4() throws Exception {
        String s = "))(";
        int num = l.longestValidParentheses(s);
        assertEquals(num, 0);
    }
}