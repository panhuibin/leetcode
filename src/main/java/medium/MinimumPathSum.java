package medium;

/**
 * https://leetcode.com/problems/minimum-path-sum/description/
 * Given a m x n grid filled with non-negative numbers, find a path from top left to bottom right which minimizes the sum of all numbers along its path.
 * <p>
 * Note: You can only move either down or right at any point in time.
 * <p>
 * Example:
 * <p>
 * Input:
 * [
 * [1,3,1],
 * [1,5,1],
 * [4,2,1]
 * ]
 * Output: 7
 * Explanation: Because the path 1→3→1→1→1 minimizes the sum.
 */
public class MinimumPathSum {
    public int minPathSum(int[][] grid) {
        return minPath(grid, 0, 0, 0);
    }

    private int minPath(int[][] grid, int i, int j, int sum) {
        int height = grid.length;
        int width = grid[0].length;
        int currentSum = sum + grid[i][j];
        if (i == height - 1 && j == width - 1) return currentSum;
        else if (i < height - 1 && j < width - 1) {
            int downSum = minPath(grid, i + 1, j, currentSum);
            int rightSum = minPath(grid, i, j + 1, currentSum);
            return Math.min(rightSum, downSum);
        } else if (i < height - 1) {
            return minPath(grid, i + 1, j, currentSum);
        } else {
            return minPath(grid, i, j + 1, currentSum);
        }

    }


}
