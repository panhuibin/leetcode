package easy;

/**
 * https://leetcode.com/problems/move-zeroes/
 * Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.
 *
 * Example:
 *
 * Input: [0,1,0,3,12]
 * Output: [1,3,12,0,0]
 * Note:
 *
 * You must do this in-place without making a copy of the array.
 * Minimize the total number of operations.
 */
class MoveZeroes {
    public void moveZeroes(int[] nums) {
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0){
               boolean isAllZero = bubbleMoveToEnd(nums,i);
               if(!isAllZero) i--;
            }
        }
    }

    private boolean bubbleMoveToEnd(int[] nums, int index){
        boolean isAllZero = true;
        for(int i=index;i<nums.length-1;i++){
            int temp = nums[i];
            nums[i] = nums[i+1];
            nums[i+1] = temp;
            if(nums[i]!=0 || nums[i+1]!=0) isAllZero = false;
        }
        return isAllZero;
    }
}
