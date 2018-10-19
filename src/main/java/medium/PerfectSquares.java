package medium;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/perfect-squares/
 * Given a positive integer n, find the least number of perfect square numbers (for example, 1, 4, 9, 16, ...) which sum to n.
 * <p>
 * Example 1:
 * <p>
 * Input: n = 12
 * Output: 3
 * Explanation: 12 = 4 + 4 + 4.
 * Example 2:
 * <p>
 * Input: n = 13
 * Output: 2
 * Explanation: 13 = 4 + 9.
 */

class PerfectSquares {
    public int numSquares(int n) {
        if (n <= 0) return 0;
        Integer[] counts = new Integer[n + 1];
        Arrays.fill(counts, Integer.MAX_VALUE);
        counts[0] = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j * j <= i; j++) {
                counts[i] = Math.min(counts[i], counts[i - j * j] + 1);
            }
        }
        return counts[n];
    }
}
