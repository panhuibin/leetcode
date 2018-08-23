package easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaximumSubarrayTest {

    MaximumSubarray m = new MaximumSubarray();

    @Test
    public void maxSubArray() {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int maxSum = m.maxSubArray(nums);
        assertEquals(maxSum,6);
    }

    @Test
    public void maxSubArray2() {
        int[] nums = {-2,1};
        int maxSum = m.maxSubArray(nums);
        assertEquals(maxSum,1);
    }
}