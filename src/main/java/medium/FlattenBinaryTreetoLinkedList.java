package medium;

import module.TreeNode;

class FlattenBinaryTreetoLinkedList {

    //preorder recursive
    public void flatten(TreeNode root) {
        recursivelyFlatten(root);
    }

    private TreeNode recursivelyFlatten(TreeNode root) {
        if (root==null) return null;
        TreeNode leftBranch = null;
        TreeNode rightBranch = null;
        if (root.left != null) {
            leftBranch = recursivelyFlatten(root.left);
        }
        if (root.right != null) {
            rightBranch = recursivelyFlatten(root.right);
        }
        TreeNode leftBranchEndNode = leftBranch;
        while (leftBranchEndNode!=null && leftBranchEndNode.right != null) leftBranchEndNode = leftBranchEndNode.right;
        root.left = null;
        if (leftBranch != null) {
            root.right = leftBranch;
            leftBranchEndNode.right = rightBranch;
        } else {
            root.right = rightBranch;
        }
        return root;
    }
}
