package medium;

/**
 * https://leetcode.com/problems/search-in-rotated-sorted-array/description/
 * Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand.
 * <p>
 * (i.e., [0,1,2,4,5,6,7] might become [4,5,6,7,0,1,2]).
 * <p>
 * You are given a target value to search. If found in the array return its index, otherwise return -1.
 * <p>
 * You may assume no duplicate exists in the array.
 * <p>
 * Your algorithm's runtime complexity must be in the order of O(log n).
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [4,5,6,7,0,1,2], target = 0
 * Output: 4
 * Example 2:
 * <p>
 * Input: nums = [4,5,6,7,0,1,2], target = 3
 * Output: -1
 */
class SearchInRotatedSortedArray {
    public int search(int[] nums, int target) {
        // decide the offset with /2 division

        if (nums.length == 0) {
            return -1;
        } else if (nums.length == 1) {
            return nums[0] == target ? 0 : -1;
        }
        int offset = findOffset(nums, 0, nums.length - 1);
        int[] numsNew = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            numsNew[i] = nums[(i + offset) % nums.length];
        }
        // decide the find value
        int targetIndex = findTarget(numsNew, 0, numsNew.length - 1, target);
        return targetIndex == -1 ? -1 : (targetIndex + offset) % nums.length;
    }

    private int findOffset(int[] nums, int startingIndex, int endingIndex) {
        if (startingIndex < endingIndex - 1) {
            int middleIndex = (startingIndex + endingIndex) / 2;
            int leftValue = nums[startingIndex];
            int rightValue = nums[endingIndex];
            int currentValue = nums[middleIndex];
            if (leftValue > currentValue) {
                //from left to current is not in good consequence, the break point is in that part.
                return findOffset(nums, startingIndex, middleIndex);
            } else if (currentValue > rightValue) {
                //from current to right is not in good consequence, the break point is not in that part
                return findOffset(nums, middleIndex, endingIndex);
            } else {
                //from left to current to right is in good consequence.
                return 0;
            }
        } else {
            return endingIndex;
        }
    }

    private int findTarget(int[] nums, int startIndex, int endIndex, int target) {
        if (startIndex < endIndex - 1) {
            int middleIndex = (startIndex + endIndex) / 2;
            int middleValue = nums[middleIndex];
            if (middleValue == target) {
                return middleIndex;
            } else if (middleValue > target) {
                return findTarget(nums, startIndex, middleIndex, target);
            } else {
                return findTarget(nums, middleIndex, endIndex, target);
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
}
