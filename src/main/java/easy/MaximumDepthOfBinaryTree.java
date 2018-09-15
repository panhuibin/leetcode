package easy;

import module.TreeNode;

class MaximumDepthOfBinaryTree {

    public int maxDepth(TreeNode root) {
        return recursiveMaxDepth(0, root);
    }

    private int recursiveMaxDepth(int currentDepth, TreeNode node) {
        if (node == null) return currentDepth;
        else
            return (Math.max(recursiveMaxDepth(currentDepth + 1, node.left), recursiveMaxDepth(currentDepth + 1, node.right)));
    }
}
