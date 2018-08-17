package easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SearchInsertPositionTest {
    SearchInsertPosition s = new SearchInsertPosition();

    @Test
    public void searchInsert() throws Exception {
        int[] nums = {1, 3, 5, 6};
        int result = s.searchInsert(nums, 5);
        assertEquals(result, 2);
    }

    @Test
    public void searchInsert2() throws Exception {
        int[] nums = {1, 3, 5, 6};
        int result = s.searchInsert(nums, 2);
        assertEquals(result, 1);
    }

    @Test
    public void searchInsert3() throws Exception {
        int[] nums = {1, 3, 5, 6};
        int result = s.searchInsert(nums, 7);
        assertEquals(result, 4);
    }

    @Test
    public void searchInsert4() throws Exception {
        int[] nums = {1, 3, 5, 6};
        int result = s.searchInsert(nums, 0);
        assertEquals(result, 0);
    }

    @Test
    public void searchInsert5() throws Exception {
        int[] nums = {};
        int result = s.searchInsert(nums, 9);
        assertEquals(result, 0);
    }

}