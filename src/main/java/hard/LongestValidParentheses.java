package hard;

/**
 * https://leetcode.com/problems/longest-valid-parentheses/description/
 * Given a string containing just the characters '(' and ')', find the length of the longest valid (well-formed) parentheses substring.
 * <p>
 * Example 1:
 * <p>
 * Input: "(()"
 * Output: 2
 * Explanation: The longest valid parentheses substring is "()"
 * Example 2:
 * <p>
 * Input: ")()())"
 * Output: 4
 * Explanation: The longest valid parentheses substring is "()()"
 * <p>
 * invalid ((())), (()()), ((())),
 */

class LongestValidParentheses {
    public int longestValidParentheses(String s) {
        int longest = 0;
        int sLen = s.length();
        int startingParenthesCount = 0;
        int closingParenthesesCount = 0;

        for (int i = 0; i < sLen; i++) {
            if (s.substring(i, i + 1).equals("(")) {
                startingParenthesCount++;
            } else {
                closingParenthesesCount++;
            }
            if (startingParenthesCount < closingParenthesesCount) {
                startingParenthesCount = 0;
                closingParenthesesCount = 0;
            } else if (startingParenthesCount >= closingParenthesesCount) {
                longest = Math.max(closingParenthesesCount * 2, longest);
            }
        }
        return longest;
    }


    public boolean isValidParentheses(String s) {
        if (s.length() % 2 != 0) return false;
        int startingParenthesCount = 0;
        int closingParenthesesCount = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.substring(i, i + 1).equals("(")) {
                startingParenthesCount++;
            } else {
                closingParenthesesCount++;
            }
            if (closingParenthesesCount > startingParenthesCount) return false;
        }
        if (closingParenthesesCount == startingParenthesCount) {
            return true;
        } else {
            return false;
        }
    }
}
