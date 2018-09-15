package medium;

import java.util.ArrayList;
import java.util.List;

import module.TreeNode;

class BinaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> levels = new ArrayList<>();
        List<TreeNode> currentLevelNodes = new ArrayList<>();
        if(root==null) return  levels;
        currentLevelNodes.add(root);
        return recursiveLevels(levels, currentLevelNodes);
    }

    private List<List<Integer>> recursiveLevels(List<List<Integer>> levels, List<TreeNode> currentLevelNodes) {
        List<List<Integer>> currentLevels = new ArrayList<>(levels);
        List<TreeNode> nextLevelNodes = new ArrayList<>();
        List<Integer> currentLevelVals = new ArrayList<>();
        for (TreeNode node : currentLevelNodes) {
            if(node.left!=null) nextLevelNodes.add(node.left);
            if(node.right!=null) nextLevelNodes.add(node.right);
            currentLevelVals.add(node.val);
        }
        currentLevels.add(currentLevelVals);
        if(nextLevelNodes.size()==0) return currentLevels;
        else return recursiveLevels(currentLevels, nextLevelNodes);
    }
}
