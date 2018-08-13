package medium;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/generate-parentheses/description/
 * <p>
 * Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.
 * <p>
 * For example, given n = 3, a solution set is:
 * <p>
 * [
 * "((()))",
 * "(()())",
 * "(())()",
 * "()(())",
 * "()()()"
 * ]
 */
public class GenerateParentheses {

    public List<String> generateParentheses(int n) {
        if (n == 0) return null;
        List<String> parenthensesList = new ArrayList<>();
        parenthensesList.add("");
        for (int i = 0; i < n * 2; i++) {
            List<String> tempList = new ArrayList<>();
            for (String parenthesesString : parenthensesList) {
                int startingParenthesesCount = countInString(parenthesesString, "(");
                int closingParentesesCount = countInString(parenthesesString, ")");
                //the only valid one is the closing parenteses
                if (startingParenthesesCount >= n && closingParentesesCount < n) {
                    tempList.add(parenthesesString + ")");
                } else if (startingParenthesesCount > closingParentesesCount && startingParenthesesCount < n) {
                    tempList.add(parenthesesString + "(");
                    tempList.add(parenthesesString + ")");
                } else {
                    tempList.add(parenthesesString + "(");
                }
            }
            parenthensesList = tempList;
        }
        return parenthensesList;

    }

    public int countInString(String text, String pattern) {
        String temp = text;
        int count = 0;
        while (temp.contains(pattern)) {
            int index = temp.indexOf(pattern);
            temp = temp.substring(index + pattern.length());
            count++;
        }
        return count;
    }
}
