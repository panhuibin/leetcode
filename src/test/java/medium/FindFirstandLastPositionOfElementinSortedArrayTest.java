package medium;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class FindFirstandLastPositionOfElementinSortedArrayTest {
    FindFirstandLastPositionOfElementinSortedArray f = new FindFirstandLastPositionOfElementinSortedArray();

    @Test
    public void searchRange() throws Exception {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int[] range = f.searchRange(nums, 8);
        assertArrayEquals(range, new int[]{3, 4});
    }

    @Test
    public void searchRange2() throws Exception {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int[] range = f.searchRange(nums, 6);
        assertArrayEquals(range, new int[]{-1, -1});
    }

    @Test
    public void searchRange3() throws Exception {
        int[] nums = {7, 7};
        int[] range = f.searchRange(nums, 7);
        assertArrayEquals(range, new int[]{0, 1});
    }

    @Test
    public void searchRange4() throws Exception {
        int[] nums = {7, 8};
        int[] range = f.searchRange(nums, 7);
        assertArrayEquals(range, new int[]{0, 0});
    }

    @Test
    public void searchRange5() throws Exception {
        int[] nums = {7};
        int[] range = f.searchRange(nums, 7);
        assertArrayEquals(range, new int[]{0, 0});
    }

    @Test
    public void searchRange6() throws Exception {
        int[] nums = {};
        int[] range = f.searchRange(nums, 7);
        assertArrayEquals(range, new int[]{-1, -1});
    }

}