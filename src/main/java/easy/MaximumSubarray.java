package easy;

/**
 * https://leetcode.com/problems/maximum-subarray/description/
 * Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
 *
 * Example:
 *
 * Input: [-2,1,-3,4,-1,2,1,-5,4],
 * Output: 6
 * Explanation: [4,-1,2,1] has the largest sum = 6.
 * Follow up:
 *
 * If you have figured out the O(n) solution, try coding another solution using the divide and conquer approach, which is more subtle.
 */
class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        if(nums.length==1) return nums[0];
        int maxSum = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            int currentSum=0;
            for(int j=i;j<nums.length;j++){
                if(j==i) currentSum = nums[j];
                else currentSum+=nums[j];
                maxSum = Math.max(currentSum,maxSum);
            }
        }
        return maxSum;
    }
}
