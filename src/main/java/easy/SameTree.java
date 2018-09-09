package easy;

import module.TreeNode;

/**
 * https://leetcode.com/problems/same-tree/description/
 * Given two binary trees, write a function to check if they are the same or not.
 * <p>
 * Two binary trees are considered the same if they are structurally identical and the nodes have the same value.
 * <p>
 * Example 1:
 * <p>
 * Input:     1         1
 * / \       / \
 * 2   3     2   3
 * <p>
 * [1,2,3],   [1,2,3]
 * <p>
 * Output: true
 * Example 2:
 * <p>
 * Input:     1         1
 * /           \
 * 2             2
 * <p>
 * [1,2],     [1,null,2]
 * <p>
 * Output: false
 * Example 3:
 * <p>
 * Input:     1         1
 * / \       / \
 * 2   1     1   2
 * <p>
 * [1,2,1],   [1,1,2]
 * <p>
 * Output: false
 */
class SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        return recursiveSameTree(p, q);
    }

    private boolean recursiveSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        else if (p == null || q == null) return false;
        else {
            return (p.val == q.val) && recursiveSameTree(p.left, q.left) && recursiveSameTree(p.right, q.right);
        }
    }
}
