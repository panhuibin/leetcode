package easy;

import module.TreeNode;

/**
 * https://leetcode.com/problems/symmetric-tree/description/
 * Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).
 * <p>
 * For example, this binary tree [1,2,2,3,4,4,3] is symmetric:
 * <p>
 * 1
 * / \
 * 2   2
 * / \ / \
 * 3  4 4  3
 * But the following [1,2,2,null,3,null,3] is not:
 * 1
 * / \
 * 2   2
 * \   \
 * 3    3
 * Note:
 * Bonus points if you could solve it both recursively and iteratively.
 */
class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        return recursivelyCheckSymmetric(root.left, root.right);
    }

    private boolean recursivelyCheckSymmetric(TreeNode left, TreeNode right) {
        if (left == null && right == null) return true;
        else if (left == null && right != null) return false;
        else if (left != null && right == null) return false;
        else if (left.val != right.val) return false;
        else return recursivelyCheckSymmetric(left.left, right.right) &&
                    recursivelyCheckSymmetric(left.right, right.left);
    }
}
