package hard;

import org.junit.Assert;
import org.junit.Test;

public class LongestConsecutiveSequenceTest {
    LongestConsecutiveSequence l = new LongestConsecutiveSequence();

    @Test
    public void longestConsecutive1() {
        int[] nums = {100, 4, 200, 1, 3, 2};
        Assert.assertEquals(4, l.longestConsecutive(nums));
    }

    @Test
    public void longestConsecutive2() {
        int[] nums = {1,2,0,1};
        Assert.assertEquals(3, l.longestConsecutive(nums));
    }

    @Test
    public void longestConsecutive3() {
        int[] nums = {0,0,-1};
        Assert.assertEquals(2, l.longestConsecutive(nums));
    }

    @Test
    public void longestConsecutive4() {
        int[] nums = {4,0,-4,-2,2,5,2,0,-8,-8,-8,-8,-1,7,4,5,5,-4,6,6,-3};
        Assert.assertEquals(5, l.longestConsecutive(nums));
    }
}