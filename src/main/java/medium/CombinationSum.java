package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://leetcode.com/problems/combination-sum/description/
 * Given a set of candidate numbers (candidates) (without duplicates) and a target number (target), find all unique combinations in candidates where the candidate numbers sums to target.
 * <p>
 * The same repeated number may be chosen from candidates unlimited number of times.
 * <p>
 * Note:
 * <p>
 * All numbers (including target) will be positive integers.
 * The solution set must not contain duplicate combinations.
 * Example 1:
 * <p>
 * Input: candidates = [2,3,6,7], target = 7,
 * A solution set is:
 * [
 * [7],
 * [2,2,3]
 * ]
 * Example 2:
 * <p>
 * Input: candidates = [2,3,5], target = 8,
 * A solution set is:
 * [
 * [2,2,2,2],
 * [2,3,3],
 * [3,5]
 * ]
 */

public class CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> combinations = new ArrayList<>();
        if(candidates.length==0) return combinations;
        getCombination(combinations, null, candidates, target);
        return combinations;
    }


    private void getCombination(List<List<Integer>> combinations, List<Integer> singleResult, int[] nums, int target) {
        singleResult = singleResult == null ? new ArrayList<>() : new ArrayList<>(singleResult);
        List<Integer> currentResult = singleResult == null ?
                new ArrayList<>() : new ArrayList<>(singleResult);
        int firstNum = nums[0];

        if ((target >= firstNum) && (target % nums[0] == 0)){
            for (int i = 0; i < (target / firstNum); i++) singleResult.add(firstNum);
            combinations.add(singleResult);
        }

        if ((target - firstNum) > 0 && nums.length > 1) {
            int[] newNums = new int[nums.length - 1];
            System.arraycopy(nums, 1, newNums, 0, nums.length - 1);
            getCombination(combinations,currentResult,newNums,target);
            for (int i = 0; i < target / nums[0]; i++) {
                currentResult.add(nums[0]);
                getCombination(combinations, currentResult, newNums, target - (nums[0] * (i + 1)));
            }

        }

    }
}
