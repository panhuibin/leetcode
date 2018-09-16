package medium;

import org.junit.Test;

import module.TreeNode;

import static org.junit.Assert.*;

public class FlattenBinaryTreetoLinkedListTest {

    FlattenBinaryTreetoLinkedList f = new FlattenBinaryTreetoLinkedList();

    @Test
    public void flattenTest1() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right = new TreeNode(5);
        root.right.right = new TreeNode(6);
        f.flatten(root);
    }

    @Test
    public void flattenTest2() {
        TreeNode root = null;
        f.flatten(root);
    }
}