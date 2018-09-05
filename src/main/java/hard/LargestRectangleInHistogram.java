package hard;

import java.util.Stack;

/**
 * https://leetcode.com/problems/largest-rectangle-in-histogram/description/
 * Given n non-negative integers representing the histogram's bar height where the width of each bar is 1, find the area of largest rectangle in the histogram.
 * <p>
 * <p>
 * Above is a histogram where width of each bar is 1, given height = [2,1,5,6,2,3].
 * <p>
 * <p>
 * <p>
 * <p>
 * The largest rectangle is shown in the shaded area, which has area = 10 unit.
 * <p>
 * <p>
 * <p>
 * Example:
 * <p>
 * Input: [2,1,5,6,2,3]
 * Output: 10
 */
class LargestRectangleInHistogram {
    public int largestRectangleArea(int[] height) {

        // Create an empty stack. The stack holds indexes of hist[] array
        // The bars stored in stack are always in increasing order of their
        // heights.
        Stack<Integer> s = new Stack<>();
        int maxArea = 0; // Initialize max area
        int topOfStack;  // To store top of stack
        int areaOfTop; // To store area with top bar as the smallest bar

        // Run through all bars of given histogram
        int i = 0;

        while (i < height.length) {
            //if this bar is higher than the bar on top stack, push it to stack
            if (s.isEmpty() || height[s.peek()] < height[i]) {
                s.push(i++);
            }
            //if the bar is lower than the bar on top stack,then calculate the area of the rectangle
            //with the stack top as the smallest (or minimum height) bar.
            //'i' is 'right index' for the top and element before top in stack is 'left index'
            else {
                topOfStack = s.peek();//store the top index
                s.pop(); //pop the top
                //calculate the area with height[topOfStack] as the smallest bar
                areaOfTop = height[topOfStack] * (s.isEmpty() ? i : i - s.peek() - 1);

                //update maxArea
                maxArea = Math.max(maxArea, areaOfTop);
            }
        }
        //now pop the reminding bars from the stack and calculate area with every poped bar as the smallest bar
        while (!s.isEmpty()) {
            topOfStack = s.peek();
            s.pop();
            areaOfTop = height[topOfStack] * (s.isEmpty() ? i : i - s.peek() - 1);
            maxArea = Math.max(maxArea, areaOfTop);
        }

        return maxArea;
    }
}
