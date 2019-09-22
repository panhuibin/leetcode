package medium;

/**
 * https://leetcode.com/problems/longest-increasing-subsequence/
 * Given an unsorted array of integers, find the length of longest increasing subsequence.
 * <p>
 * Example:
 * <p>
 * Input: [10,9,2,5,3,7,101,18]
 * Output: 4
 * Explanation: The longest increasing subsequence is [2,3,7,101], therefore the length is 4.
 */

class LongestIncreasingSubsequence {
    public int lengthOfLIS(int[] nums) {
        int maxLength = 1;
        int currentIndex = 1;

        if (nums.length == 0) return 0;
        if (nums.length == 1) return 1;

        for (int i = 0; i < nums.length; i++) {
            for(int j=i+1;j<nums.length;j++){

            }
        }
        return maxLength;
    }
}
