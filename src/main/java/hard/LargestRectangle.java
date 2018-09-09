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
        int[][] dp = new int[rLen][cLen];
        
        for (int row = 0; row < rLen; row++) {
            for (int col = 0; col < cLen; col++) {
                dp[row][col] = matrix[row][col] - '0';
                if(dp[row][col]>0 && row>0){
                    dp[row][col] += dp[row-1][col];
                }//otherwise restart the accumulation
            }
        }
        int max = 0;
        for(int[] row:dp){
            //now the accumulation is over, we have histogram again
            max = Math.max(largestRectangleArea(row),max);
        }
        return max;
    }

    // copied "Largest Rectangle in Histogram" solution
    private int largestRectangleArea(int[] heights) {
        // Create an empty stack. The stack holds indexes of hist[] array
        // The bars stored in stack are always in increasing order of their
        // heights.
        Stack<Integer> s = new Stack<>();
        int maxArea = 0; // Initialize max area
        int topOfStack;  // To store top of stack
        int areaOfTop; // To store area with top bar as the smallest bar

        // Run through all bars of given histogram
        int i = 0;

        while (i < heights.length) {
            //if this bar is higher than the bar on top stack, push it to stack
            if (s.isEmpty() || heights[s.peek()] < heights[i]) {
                s.push(i++);
            }
            //if the bar is lower than the bar on top stack,then calculate the area of the rectangle
            //with the stack top as the smallest (or minimum heights) bar.
            //'i' is 'right index' for the top and element before top in stack is 'left index'
            else {
                topOfStack = s.peek();//store the top index
                s.pop(); //pop the top
                //calculate the area with heights[topOfStack] as the smallest bar
                areaOfTop = heights[topOfStack] * (s.isEmpty() ? i : i - s.peek() - 1);

                //update maxArea
                maxArea = Math.max(maxArea, areaOfTop);
            }
        }
        //now pop the reminding bars from the stack and calculate area with every poped bar as the smallest bar
        while (!s.isEmpty()) {
            topOfStack = s.peek();
            s.pop();
            areaOfTop = heights[topOfStack] * (s.isEmpty() ? i : i - s.peek() - 1);
            maxArea = Math.max(maxArea, areaOfTop);
        }

        return maxArea;
    }
}
