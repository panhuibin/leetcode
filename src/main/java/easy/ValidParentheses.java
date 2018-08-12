package easy;

import java.util.Stack;

/**
 * https://leetcode.com/problems/valid-parentheses/description/
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 * <p>
 * An input string is valid if:
 * <p>
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * Note that an empty string is also considered valid.
 */
class ValidParentheses {
    public boolean isValid(String s) {
        Stack stack = new Stack();
        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            if (c.equals('{') || c.equals('[') || c.equals('(')) {
                stack.push(c);
            } else if (c.equals('}') || c.equals(']') || c.equals(')')) {
                if (stack.empty()) return false;
                if (c.equals('}') && stack.peek().equals('{')) {
                    stack.pop();
                } else if (c.equals('}') && !stack.peek().equals('{')) {
                    return false;
                } else if (c.equals(']') && stack.peek().equals('[')) {
                    stack.pop();
                } else if (c.equals(']') && !stack.peek().equals('[')) {
                    return false;
                } else if (c.equals(')') && stack.peek().equals('(')) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.empty();
    }
}