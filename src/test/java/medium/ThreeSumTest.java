package medium;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

public class ThreeSumTest {

    ThreeSum t = new ThreeSum();

    @Test
    public void threeSum() {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> resultList = new ArrayList<>();
        List<Integer> list1 = new ArrayList();
        list1.addAll(Arrays.asList(-1, 0, 1));
        List<Integer> list2 = new ArrayList();
        list2.addAll(Arrays.asList(-1, -1, 2));
        resultList.addAll(Arrays.asList(list1, list2));
        //assertEquals(t.threeSum(nums), resultList);
        int[] nums2 = {0,-4,-1,-4,-2,-3,2};
        t.threeSum(nums2);
    }
}