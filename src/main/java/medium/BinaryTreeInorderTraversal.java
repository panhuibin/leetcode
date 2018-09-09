package medium;

import java.util.ArrayList;
import java.util.List;

import module.TreeNode;


/**
 * https://leetcode.com/problems/binary-tree-inorder-traversal/description/
 * Given a binary tree, return the inorder traversal of its nodes' values.
 *
 * Example:
 *
 * Input: [1,null,2,3]
 *    1
 *     \
 *      2
 *     /
 *    3
 *
 * Output: [1,3,2]
 */

class BinaryTreeInorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        return recursiveTravesal(root, list);
    }

    private List<Integer> recursiveTravesal(TreeNode root, List<Integer> list) {
        List<Integer> currentList = new ArrayList<>();
        if(root ==null){
            return currentList;
        }else{
            currentList.addAll(recursiveTravesal(root.left,currentList));
            currentList.add(root.val);
            currentList.addAll(recursiveTravesal(root.right,currentList));
        }
        return currentList;
    }
}
