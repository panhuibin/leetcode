package easy;

import org.junit.Test;

import easy.InvertBinaryTree;
import module.TreeNode;

public class InvertBinaryTreeTest {

    InvertBinaryTree i = new InvertBinaryTree();

    @Test
    public void invertTree() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.left.left.right = new TreeNode(6);
        root.right = new TreeNode(7);
        root.right.left= new TreeNode(8);
        root.right.left.right = new TreeNode(9);
        i.invertTree(root);
    }
}