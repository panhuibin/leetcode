package easy;

import module.TreeNode;

class InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        if(root == null) return root;
        recursiveInvert(root);
        return root;
    }

    public void recursiveInvert(TreeNode node){
        if(node==null) return;
        revertSingleNode(node);
        recursiveInvert(node.left);
        recursiveInvert(node.right);
    }

    public void revertSingleNode(TreeNode node){
        TreeNode temp = node.right;
        node.right = node.left;
        node.left = temp;
    }

}
