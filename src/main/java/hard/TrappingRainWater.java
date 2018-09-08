package hard;

import java.util.Stack;

/**
 * https://leetcode.com/problems/trapping-rain-water/description/
 * <p>
 * Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it is able to trap after raining.
 * <p>
 * <p>
 * The above elevation map is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain water (blue section) are being trapped. Thanks Marcos for contributing this image!
 * <p>
 * Example:
 * <p>
 * Input: [0,1,0,2,1,0,1,3,2,1,2,1]
 * Output: 6
 */
public class TrappingRainWater {


    public int trap(int[] heights) {
        //try to re-use teh largestRectangleHistogram solution: using stack for solution
        // Create an empty stack. The stack holds indexes of hist[] array
        // The bars stored in stack are always in decreasing order of their
        // heights.
        Stack<Integer> s = new Stack<>();
        int maxArea = 0; // Initialize max area
        int topOfStack;  // To store top of stack
        int areaOfTop; // To store area with top bar as the smallest bar

        // Run through all bars of given histogram
        int i = 0;

        while (i < heights.length) {
            //if this bar is lower than the bar on top stack, push it to stack
            if (s.isEmpty() || heights[s.peek()] >= heights[i]) {
                s.push(i++);
            }
            //if the bar is higher than the bar on top stack,then calculate the area of the rectangle
            //with the stack top as the smallest (or minimum heights) bar.
            //'i' is 'right index' for the top and element before top in stack is 'left index'
            else {
                topOfStack = s.pop();//store the top index
                //calculate the that's storing the water
                if(!s.isEmpty()){
                    int rimHeight = Math.min(heights[i], heights[s.peek()]);
                    areaOfTop = (rimHeight - heights[topOfStack]) * (i - s.peek() - 1);
                    maxArea += areaOfTop;
                }
            }
        }

        return maxArea;
    }


}
