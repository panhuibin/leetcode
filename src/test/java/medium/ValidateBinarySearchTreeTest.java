package medium;

import org.junit.Test;

import module.TreeNode;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ValidateBinarySearchTreeTest {

    ValidateBinarySearchTree v = new ValidateBinarySearchTree();

    @Test
    public void isValidBST() {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(3);
        assertTrue(v.isValidBST(root));
    }

    @Test
    public void isValidBST1() {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        assertFalse(v.isValidBST(root));
    }

}