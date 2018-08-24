package medium;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/unique-paths/description/
 * A robot is located at the top-left corner of a m x n grid (marked 'Start' in the diagram below).
 * <p>
 * The robot can only move either down or right at any point in time. The robot is trying to reach the bottom-right corner of the grid (marked 'Finish' in the diagram below).
 * <p>
 * How many possible unique paths are there?
 * <p>
 * <p>
 * Above is a 7 x 3 grid. How many possible unique paths are there?
 * <p>
 * Note: m and n will be at most 100.
 * <p>
 * Example 1:
 * <p>
 * Input: m = 3, n = 2
 * Output: 3
 * Explanation:
 * From the top-left corner, there are a total of 3 ways to reach the bottom-right corner:
 * 1. Right -> Right -> Down
 * 2. Right -> Down -> Right
 * 3. Down -> Right -> Right
 * Example 2:
 * <p>
 * Input: m = 7, n = 3
 * Output: 28
 */
public class UniquePaths {

    public int uniquePaths(int m, int n) {
        List<List<String>> uniquePaths = new ArrayList();
        List<String> path = new ArrayList();
        recursiveAddUniquePath(m, n, uniquePaths, path);
        return uniquePaths.size();
    }

    private void recursiveAddUniquePath(int m, int n, List<List<String>> uniquePaths, List<String> currentPath) {
        if (m == 0 && n == 0) return;

        if (m > 0 || n > 0) uniquePaths.remove(currentPath);
        if (m > 0) {
            List<String> newCurrentPath = new ArrayList(currentPath);
            newCurrentPath.add("Right");
            uniquePaths.add(newCurrentPath);
            recursiveAddUniquePath(m - 1, n, uniquePaths, newCurrentPath);
        }

        if (n > 0) {
            List<String> newCurrentPath = new ArrayList(currentPath);
            newCurrentPath.add("Down");
            uniquePaths.add(newCurrentPath);
            recursiveAddUniquePath(m, n - 1, uniquePaths, newCurrentPath);
        }
    }

    private void print(List<List<String>> uniquePaths) {
        uniquePaths.forEach(uniquePath -> {
            uniquePath.forEach(direction -> System.out.print(direction + ","));
            System.out.print("\n");
        });
    }
}
