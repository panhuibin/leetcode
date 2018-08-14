package medium;

/**
 * https://leetcode.com/problems/zigzag-conversion/description/
 * The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)
 * <p>
 * P   A   H   N
 * A P L S I I G
 * Y   I   R
 * And then read line by line: "PAHNAPLSIIGYIR"
 * <p>
 * Write the code that will take a string and make this conversion given a number of rows:
 * <p>
 * string convert(string s, int numRows);
 * Example 1:
 * <p>
 * Input: s = "PAYPALISHIRING", numRows = 3
 * Output: "PAHNAPLSIIGYIR"
 * Example 2:
 * <p>
 * Input: s = "PAYPALISHIRING", numRows = 4
 * Output: "PINALSIGYAHRPI"
 * Explanation:
 * <p>
 * P     I    N
 * A   L S  I G
 * Y A   H R
 * P     I
 */
public class ZigZagConversion {
    public String convert(String s, int numRows) {
        if (numRows == 1 || numRows >= s.length()) return s;
        String[] zigzags = new String[numRows];
        for (int i = 0; i < numRows; i++) {
            zigzags[i] = "";
        }
        boolean isDownward = false;
        int row = 0;
        for (int i = 0; i < s.length(); i++) {
            if (row == 0) {
                isDownward = true;
            } else if (row == numRows - 1)
                isDownward = false;

            String currentLetter = s.substring(i, i + 1);
            zigzags[row] += currentLetter;
            if (isDownward) {
                row++;
            } else {
                row--;
            }
        }

        String output = "";
        for (String zigzag : zigzags) {
            output += zigzag;
        }
        return output;
    }
}
