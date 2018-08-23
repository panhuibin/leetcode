package medium;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/jump-game/description/
 * Given an array of non-negative integers, you are initially positioned at the first index of the array.
 * <p>
 * Each element in the array represents your maximum jump length at that position.
 * <p>
 * Determine if you are able to reach the last index.
 * <p>
 * Example 1:
 * <p>
 * Input: [2,3,1,1,4]
 * Output: true
 * Explanation: Jump 1 step from index 0 to 1, then 3 steps to the last index.
 * Example 2:
 * <p>
 * Input: [3,2,1,0,4]
 * Output: false
 * Explanation: You will always arrive at index 3 no matter what. Its maximum
 * jump length is 0, which makes it impossible to reach the last index.
 */
class JumpGame {
    public boolean canJump(int[] nums) {
        int[] positionTried = new int[nums.length];
        Arrays.fill(positionTried, 0);
        return isReachingTheEnd(nums, 0, positionTried);
    }

    private boolean isReachingTheEnd(int[] nums, int currentIndex, int[] positionsTried) {
        int currentVal = nums[currentIndex];
        if (currentVal == 0 && currentIndex < nums.length - 1) {
            positionsTried[currentIndex] = 1;
            return false;
        }
        if ((currentVal + currentIndex) >= (nums.length - 1)) {
            positionsTried[currentIndex] = 1;
            return true;
        } else {
            for (int i = 1; i <= currentVal; i++) {
                int nextPositionToTry = currentIndex + i;
                if (positionsTried[nextPositionToTry] == 0) {
                    if (isReachingTheEnd(nums, nextPositionToTry, positionsTried) == true) {
                        return true;
                    }
                }
            }
            positionsTried[currentIndex] = 1;
            return false;
        }
    }
}
