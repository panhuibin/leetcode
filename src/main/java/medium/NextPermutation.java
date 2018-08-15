package medium;

/**
 * https://leetcode.com/problems/next-permutation/description/
 * Implement next permutation, which rearranges numbers into the lexicographically next greater permutation of numbers.
 * <p>
 * If such arrangement is not possible, it must rearrange it as the lowest possible order (ie, sorted in ascending order).
 * <p>
 * The replacement must be in-place and use only constant extra memory.
 * <p>
 * Here are some examples. Inputs are in the left-hand column and its corresponding outputs are in the right-hand column.
 * <p>
 * 1,2,3 → 1,3,2
 * 3,2,1 → 1,2,3
 * 1,1,5 → 1,5,1
 * 1243 ->  1234 -> 1324
 * 2431 ->  3124
 * 52431 -> 53124
 * 12431 -> 13124
 * start from tail. when we find the num[n-1] < num[n] there's no need to go further
 * 2431 -> when num[0] < num[1] find the next largest digit in the following digits for the first digit
 * find the smallest digit for the next
 */

class NextPermutation {
    public void nextPermutation(int[] nums) {
        if (nums.length <= 1) return;
        int currentNum;
        int prevNum = 0;
        int i;
        for (i = nums.length - 1; i > 0; i--) {
            currentNum = nums[i];
            prevNum = nums[i - 1];
            if (prevNum < currentNum) {
                break;
            }
        }
        //if all digits are sorted large to small, then no need to consider prev num, simply revert everything.
        if (i == 0) {
            for (int j = 0; j < nums.length / 2 ; j++) {
                int leftNum = nums[j];
                int rightNum = nums[nums.length - 1 - j];
                nums[j] = rightNum;
                nums[nums.length - 1 - j] = leftNum;
            }
        } else {
            int indexToSwitch = -1;
            int tempSwitchNum = Integer.MAX_VALUE;
            for (int j = i; j < nums.length; j++) {
                if ((nums[j] > prevNum) && (nums[j] <= tempSwitchNum)) {
                    indexToSwitch = j;
                }
            }
            nums[i - 1] = nums[indexToSwitch];
            nums[indexToSwitch] = prevNum;

            //now time to sort array to ascending mode
            // j = 0, 1, 2
            for (int j = 0; j < nums.length - i; j++) {
                // when j=2, k = 2, 3, 4
                // when j=3, k = 2, 3
                // when j=4, k = 2 // don't do anything
                for (int k = i; k < nums.length - 1 - j; k++) {
                    if (nums[k] > nums[k + 1]) {
                        int tmp = nums[k];
                        nums[k] = nums[k + 1];
                        nums[k + 1] = tmp;
                    }
                }
            }
        }
    }
}
