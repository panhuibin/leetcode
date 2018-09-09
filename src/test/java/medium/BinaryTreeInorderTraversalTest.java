package medium;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import module.TreeNode;

import static org.junit.Assert.*;

public class BinaryTreeInorderTraversalTest {
    BinaryTreeInorderTraversal b = new BinaryTreeInorderTraversal();

    @Test
    public void inorderTraversal() {
        TreeNode root = new TreeNode(1);
        root.left=null;
        TreeNode right = new TreeNode(2);
        root.right = right;
        right.left = new TreeNode(3);
        right.right = null;
        List<Integer> list = b.inorderTraversal(root);
        list.forEach(System.out::println);
    }
}