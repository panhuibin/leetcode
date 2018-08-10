package easy;/*
https://leetcode.com/problems/two-sum/description/
Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:

Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
 */

import java.util.Arrays;

class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] twoSum = new int[2];
        for(int i = 0; i<nums.length-1;i++){
            int firstCandidate = nums[i];
            for(int j=i+1;j<nums.length;j++){
                int secondCandidate = nums[j];
                if(firstCandidate+secondCandidate==target){
                    twoSum[0]=i;
                    twoSum[1]=j;
                    return twoSum;
                }
            }
        }
        return twoSum;
    }

    public static void main(String[] args) {

    }
}
