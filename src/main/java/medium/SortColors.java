package medium;

/**
 * Given an array with n objects colored red, white or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white and blue.
 * <p>
 * Here, we will use the integers 0, 1, and 2 to represent the color red, white, and blue respectively.
 * <p>
 * Note: You are not suppose to use the library's sort function for this problem.
 * Example:
 * <p>
 * Input: [2,0,2,1,1,0]
 * Output: [0,0,1,1,2,2]
 * Follow up:
 * <p>
 * A rather straight forward solution is a two-pass algorithm using counting sort.
 * First, iterate the array counting number of 0's, 1's, and 2's, then overwrite array with total number of 0's, then 1's and followed by 2's.
 * Could you come up with a one-pass algorithm using only constant space?
 */

class SortColors {

    public void sortColors(int[] nums) {
        int n0 = -1;
        int n1 = -1;
        int n2 = -1;
        for (int i = 0; i<nums.length;i++) {
            //overwrite and move the value forward
            if(nums[i]==0){
                //every node need to move forward to leave space for 0.
                nums[++n2] = 2;
                nums[++n1] = 1;
                nums[++n0] = 0;
            }else if(nums[i]==1){
                //n2 and n1 move forward to leave space for 1
                nums[++n2] = 2;
                nums[++n1] = 1;
            }else{
                //n2 move forward to leave space for 2
                nums[++n2] = 2;
            }

        }

    }

}
