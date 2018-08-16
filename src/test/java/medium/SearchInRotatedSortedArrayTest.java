package medium;

import org.junit.Test;

public class SearchInRotatedSortedArrayTest {

    SearchInRotatedSortedArray s = new SearchInRotatedSortedArray();

    @Test
    public void search1() throws Exception {
        int[] nums = {10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        s.search(nums, 5);
    }

    @Test
    public void search2() throws Exception {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        s.search(nums, 10);
    }

    @Test
    public void search3() throws Exception {
        int[] nums = {1};
        s.search(nums, 10);
    }

    @Test
    public void search4() throws Exception {
        int[] nums = {2, 1};
        s.search(nums, 1);
    }
}