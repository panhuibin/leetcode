package hard;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MedianOfTwoSortedArraysTest {

    @Test
    public void findMedianSortedArrays() {
        MedianOfTwoSortedArrays medianOfTwoSortedArrays = new MedianOfTwoSortedArrays();
        int[] A = {1};
        int[] B = {1};
        assertEquals(medianOfTwoSortedArrays.findMedianSortedArrays(A, B), 1.0, 0.0);

        int[] C = {3};
        int[] D = {-2, -1};
        assertEquals(medianOfTwoSortedArrays.findMedianSortedArrays(C, D), -1.0, 0.0);

        int[] nums1 = {1, 3};
        int[] nums2 = {2};
        assertEquals(medianOfTwoSortedArrays.findMedianSortedArrays(nums1, nums2), 2.0, 0.0);
        int[] nums3 = {};
        int[] nums4 = {1};
        assertEquals(medianOfTwoSortedArrays.findMedianSortedArrays(nums3, nums4), 1.0, 0.0);
    }
}