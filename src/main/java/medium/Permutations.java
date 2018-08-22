package medium;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/permutations/description/
 * Given a collection of distinct integers, return all possible permutations.
 * <p>
 * Example:
 * <p>
 * Input: [1,2,3]
 * Output:
 * [
 * [1,2,3],
 * [1,3,2],
 * [2,1,3],
 * [2,3,1],
 * [3,1,2],
 * [3,2,1]
 * ]
 */
public class Permutations {
    public List<List<Integer>> permute(int[] nums) {
        if (nums.length==0) return null;
        List<List<Integer>> permutes = new ArrayList<>();
        List<Integer> permute = new ArrayList<>();
        permutes.add(permute);
        return getPermutes(nums, permutes);
    }

    private List<List<Integer>> getPermutes(int[] nums, List<List<Integer>> permutes) {
        List<List<Integer>> newPermutes = new ArrayList<>();
        for (List<Integer> permute : permutes) {
            if (permute.size() == nums.length) return permutes;
            for (int i : nums) {
                if (!permute.contains(i)) {
                    List<Integer> newPermute = new ArrayList<>(permute);
                    newPermute.add(i);
                    newPermutes.add(newPermute);
                }
            }
        }
        return getPermutes(nums, newPermutes);
    }
}
