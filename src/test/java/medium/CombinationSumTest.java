package medium;

import org.junit.Test;

import java.util.List;

public class CombinationSumTest {

    CombinationSum c = new CombinationSum();

    @Test
    public void combinationSum() throws Exception {
        int[] nums = {2, 3, 6, 7};
        List<List<Integer>> results = c.combinationSum(nums,7);
        results.stream().forEach(System.out::println);
    }

    @Test
    public void combinationSum1() throws Exception {
        int[] nums = {3, 4, 7, 8};
        List<List<Integer>> results = c.combinationSum(nums, 11);
        results.stream().forEach(System.out::println);
    }


    @Test
    public void combinationSum2() throws Exception {
        int[] nums = {2, 3, 5};
        List<List<Integer>> results = c.combinationSum(nums,8);
        results.stream().forEach(System.out::println);
    }

    @Test
    public void combinationSum3() throws Exception {
        int[] nums = {2};
        List<List<Integer>> results = c.combinationSum(nums,8);
        results.stream().forEach(System.out::println);
    }

    @Test
    public void combinationSum4() throws Exception {
        int[] nums = {3};
        List<List<Integer>> results = c.combinationSum(nums,8);
        results.stream().forEach(System.out::println);
    }

    @Test
    public void combinationSum5() throws Exception {
        int[] nums = {};
        List<List<Integer>> results = c.combinationSum(nums,8);
        results.stream().forEach(System.out::println);
    }

}