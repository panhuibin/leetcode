package medium;

import module.TreeNode;

class ConstructBinaryTreeFromPreorderAndInorderTraversal {
    public TreeNode buildTree(int[] preOrder, int[] inOrder) {

        if (preOrder.length == 0) return null;

        return recursiveBuildTree(0, 0, inOrder.length - 1, preOrder, inOrder);
    }

    private TreeNode recursiveBuildTree(int preStart, int inStart, int inEnd, int[] preOrder, int[] inOrder) {
        if (preStart > preOrder.length - 1 || inStart > inEnd) return null;
        TreeNode root = new TreeNode(preOrder[preStart]);
        int inIndex = 0; //index of current root in inOrde
        for (int i = inStart; i <= inEnd; i++) {
            if(inOrder[i] == root.val){
                inIndex = i;
            }
        }
        // in the inOrder tree,
        // the nodes from inStart to inIndex-1 belongs to the left tree.
        // the node inIndex belongs to the root node.
        // the nodes from inIndex+1 to inEnd belongs to the right tree.
        // and we also get the size of the left tree, which is inIndex-1-inStart, so
        // in the preOrder tree,
        // the nodes preStart belongs to the root node.
        // the nodes from preStart+1 to (preStart+1)+(inIndex-1-inStart) belongs to the left tree
        // the nodes from (preStart+1)+(inIndex-1-inStart)+1 belongs to the right tree
        root.left = recursiveBuildTree(preStart+1,inStart,inIndex-1,preOrder,inOrder);
        root.right = recursiveBuildTree(preStart+inIndex-inStart+1, inIndex+1, inEnd, preOrder, inOrder);
        return root;
    }

}
