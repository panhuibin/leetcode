package hard;

import org.junit.Assert;
import org.junit.Test;

public class LongestConsecutiveSequenceTest {
    LongestConsecutiveSequence l = new LongestConsecutiveSequence();

    @Test
    public void longestConsecutive() {
        int[] nums = {100, 4, 200, 1, 3, 2};
        Assert.assertEquals(4, l.longestConsecutive(nums));
    }
}