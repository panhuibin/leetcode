package medium;

/**
 * Given n, how many structurally unique BST's (binary search trees) that store values 1 ... n?
 * <p>
 * Example:
 * <p>
 * Input: 3
 * Output: 5
 * Explanation:
 * Given n = 3, there are a total of 5 unique BST's:
 * <p>
 * 1         3     3      2      1
 * \       /     /      / \      \
 * 3     2     1      1   3      2
 * /     /       \                 \
 * 2     1         2                 3
 */

class UniqueBinarySearchTrees {
    public int numTrees(int n) {
        /**
         * when n=1 there're 1 way of tree.
         * when n=2 there're 2 way of tree:
         *  1           2
         *   |         /
         *    2       1
         * root = 1, 1.right = 2;
         * when n=3, there're 5 ways of tree.
         * when 1 is root, left has 0 nodes and right has 2 nodes, there're dp[0]*dp[2] = 2 possibility
         * when 2 is root, left has 1 node and right has 1 node, there're dp[1]*dp[1] = 1 possibility.
         * when 3 is root, left has 2 nodes and right has 0 nodes, there're dp[2]*dp[0] = 2 possibility.
         */

        int[] dp = new int[n + 1]; //calculate dp[n] by all previous dp elements
        dp[0] = 1;
        dp[1] = 1;
        //calculate dp[level] from dp[2]
        for (int level = 2; level < n + 1; level++) {
            //each need to calculate when each element are root
            for (int root = 0; root < level; root++) {
                dp[level] += dp[level - root - 1] * dp[root];
            }
        }
        return dp[n];
    }
}
