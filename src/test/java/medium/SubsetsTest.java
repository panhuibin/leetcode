package medium;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class SubsetsTest {

    Subsets s = new Subsets();

    @Test
    public void subsets() {
        int[] nums = {1,2,3};
        List<List<Integer>> subsets = s.subsets(nums);
        print(subsets);

    }

    @Test
    public void subsets1() {
        int[] nums = {1};
        List<List<Integer>> subsets = s.subsets(nums);
        print(subsets);

    }

    public void print(List<List<Integer>> subsets) {
        subsets.forEach(subset -> {
            subset.forEach(System.out::print);
            System.out.println();
        });
    }
}