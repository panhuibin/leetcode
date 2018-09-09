package hard;

import java.util.Stack;

/**
 * https://leetcode.com/problems/maximal-rectangle/description/
 * Given a 2D binary matrix filled with 0's and 1's, find the largest rectangle containing only 1's and return its area.
 * <p>
 * Example:
 * <p>
 * Input:
 * [
 * ["1","0","1","0","0"],
 * ["1","0","1","1","1"],
 * ["1","1","1","1","1"],
 * ["1","0","0","1","0"]
 * ]
 * Output: 6
 */

class LargestRectangle {
    public int maximalRectangle(char[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return 0;
        }
        int cLen = matrix[0].length;
        int rLen = matrix.length;
        //height array
        int[] h = new int[cLen + 1];
        h[cLen] = 0;
        int max = 0;

        for (int row = 0; row < rLen; row++) {
            Stack<Integer> s = new Stack<>();
            for (int col = 0; col < cLen + 1; col++) {
                if (col < cLen) {
                    if (matrix[row][col] == '1') {
                        h[col] += 1;
                    } else {
                        h[col] = 0;
                    }
                }

                //if finding an upper edge, push that value into stack
                if (s.isEmpty() || h[col] >= h[s.peek()]) {
                    s.push(col);
                } else {
                    while (!s.isEmpty() && h[col] < h[s.peek()]) {
                        int top = s.pop();
                        int area = h[top] * (s.isEmpty() ? col : (col - s.peek() - 1));
                        max = Math.max(max, area);
                    }
                    s.push(col);
                }
            }
        }
        return max;
    }
}
