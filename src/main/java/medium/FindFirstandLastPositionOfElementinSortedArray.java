package medium;

/**
 * https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/
 * Given an array of integers nums sorted in ascending order, find the starting and ending position of a given target value.
 * <p>
 * Your algorithm's runtime complexity must be in the order of O(log n).
 * <p>
 * If the target is not found in the array, return [-1, -1].
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [5,7,7,8,8,10], target = 8
 * Output: [3,4]
 * Example 2:
 * <p>
 * Input: nums = [5,7,7,8,8,10], target = 6
 * Output: [-1,-1]
 */

public class FindFirstandLastPositionOfElementinSortedArray {
    public int[] searchRange(int[] nums, int target) {
        if (nums.length == 0) {
            return new int[]{-1, -1};
        } else if (nums.length == 1) {
            return nums[0] == target ? new int[]{0, 0} : new int[]{-1, -1};
        }

        int startIndex = findFirstMatch(nums, target, 0, nums.length - 1);
        int endIndex = findLastMatch(nums, target, 0, nums.length - 1);
        int[] range = {startIndex, endIndex};
        return range;
    }

    public int findFirstMatch(int[] nums, int target, int startIndex, int endIndex) {
        if (startIndex < endIndex - 1) {
            int middleIndex = (startIndex + endIndex) / 2;
            int middleValue = nums[middleIndex];
            if (middleValue > target) {
                return findFirstMatch(nums, target, startIndex, middleIndex);
            } else if (middleValue < target) {
                return findFirstMatch(nums, target, middleIndex, endIndex);
            } else {
                return findFirstMatch(nums, target, startIndex, middleIndex);
            }
        } else {
            if (nums[startIndex] == target) {
                return startIndex;
            } else if (nums[endIndex] == target) {
                return endIndex;
            } else {
                return -1;
            }
        }
    }

    public int findLastMatch(int[] nums, int target, int startIndex, int endIndex) {
        if (startIndex < endIndex - 1) {
            int middleIndex = (startIndex + endIndex) / 2;
            int middleValue = nums[middleIndex];
            if (middleValue > target) {
                return findLastMatch(nums, target, startIndex, middleIndex);
            } else if (middleValue < target) {
                return findLastMatch(nums, target, middleIndex, endIndex);
            } else {
                return findLastMatch(nums, target, middleIndex, endIndex);
            }
        } else {
            if (nums[endIndex] == target) {
                return endIndex;
            } else if (nums[startIndex] == target) {
                return startIndex;
            } else {
                return -1;
            }
        }
    }
}
