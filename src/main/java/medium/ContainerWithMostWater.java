package medium;

/**
 * https://leetcode.com/problems/container-with-most-water/description/
 * Given n non-negative integers a1, a2, ..., an , where each represents a point at coordinate (i, ai). n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0). Find two lines, which together with x-axis forms a container, such that the container contains the most water.
 * <p>
 * Note: You may not slant the container and n is at least 2.
 */
class ContainerWithMostWater {
    public int maxArea(int[] heights) {
        int maxArea = 0;
        for (int i = 0; i < heights.length - 1; i++) {
            for (int j = 1; j < heights.length; j++) {
                int height = Math.min(heights[i], heights[j]);
                maxArea = Math.max(maxArea, height * (j - i));
            }
        }
        return maxArea;
    }
}
