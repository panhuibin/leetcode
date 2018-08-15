package medium;

import org.junit.Test;

public class NextPermutationTest {
    NextPermutation n = new NextPermutation();

    @Test
    public void nextPermutation() {
        int[] n1 = {5, 2, 4, 3, 1};
        n.nextPermutation(n1);
        int[] nums = {1, 2, 3, 4};
        n.nextPermutation(nums);
        int[] nums2 = {3, 2, 1};
        n.nextPermutation(nums2);
    }

    @Test
    public void nextPermutation2() {
        int[] n1 = {3, 2, 1};
        n.nextPermutation(n1);
    }
}