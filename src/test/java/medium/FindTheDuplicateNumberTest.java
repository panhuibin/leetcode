package medium;

import org.junit.Assert;
import org.junit.Test;

public class FindTheDuplicateNumberTest {

    FindTheDuplicateNumber f = new FindTheDuplicateNumber();

    @Test
    public void findDuplicate() {
        int[] nums = {4,1,3,4,2};
        Assert.assertEquals(4, f.findDuplicate(nums));
    }

    @Test
    public void findDuplicate2() {
        int[] nums = {3,1,3,4,2};
        Assert.assertEquals(3, f.findDuplicate(nums));
    }
}