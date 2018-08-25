package medium;

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

    /**
     * it's actually all the permutation of (right and down)
     * there're m-1 right and n-1 downs， the combination of the permutation should be (m+n-2)!/(m-1)!(n-1)!
     * when m=3,n=2, result = 3!/2!*1! = 3
     * when m=7, n=3, result = 8!/6!*2! = 8*7/2=28
     */
    public int uniquePaths(int m, int n) {
        if (m == 1 || n == 1) return 1;
        int pathSum = 1;
        int stoppingPoint = Math.max(m - 1, n - 1);
        for (int i = m + n - 2; i > stoppingPoint; i--) {
            pathSum *= i;
        }
        int dividing = Math.min(m - 1, n - 1);
        for (int i = 1; i <= dividing; i++) {
            pathSum = pathSum / i;
        }
        return pathSum;
    }

    private long pOf(int num){
        long p =1;
        for(int i=1;i<=num;i++){
            p*=i;
        }
        return p;
    }

}
