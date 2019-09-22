package medium;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class LongestIncreasingSubsequenceTest {
    LongestIncreasingSubsequence l = new LongestIncreasingSubsequence();

    @Test
    public void lengthOfLIS() {
        int[] nums = {10,9,2,5,3,7,101,18};
        Assert.assertEquals(4, l.lengthOfLIS(nums));
    }
}