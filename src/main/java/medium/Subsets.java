package medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * https://leetcode.com/problems/subsets/description/
 * Given a set of distinct integers, nums, return all possible subsets (the power set).
 *
 * Note: The solution set must not contain duplicate subsets.
 *
 * Example:
 *
 * Input: nums = [1,2,3]
 * Output:
 * [
 *   [3],
 *   [1],
 *   [2],
 *   [1,2,3],
 *   [1,3],
 *   [2,3],
 *   [1,2],
 *   []
 * ]
 */

class Subsets {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> subsets = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();
        subsets.add(subset);

        allCombinations(nums,0, subsets);

        return subsets;

    }

    private List<List<Integer>> allCombinations(int[] nums, int index, final List<List<Integer>>subsets) {
        if(index==nums.length) return subsets;
        List<List<Integer>> currentSubsets = new ArrayList<>();
        int v = nums[index];
        for(List<Integer> subset:subsets){
            List<Integer> subsetNew = new ArrayList<>(subset);
            subsetNew.add(v);
            currentSubsets.add(subsetNew);
        }
        subsets.addAll(currentSubsets);
        return allCombinations(nums,index+1,subsets);
    }


}
