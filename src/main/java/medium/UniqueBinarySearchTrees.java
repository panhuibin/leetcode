package medium;

/**
 * Given n, how many structurally unique BST's (binary search trees) that store values 1 ... n?
 *
 * Example:
 *
 * Input: 3
 * Output: 5
 * Explanation:
 * Given n = 3, there are a total of 5 unique BST's:
 *
 *    1         3     3      2      1
 *     \       /     /      / \      \
 *      3     2     1      1   3      2
 *     /     /       \                 \
 *    2     1         2                 3
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
         * so what happened? we tried to add 2 to the original tree, it can be added to the
         */

        return -1;

    }
}
