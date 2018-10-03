package easy;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MajorityElementTest {
    MajorityElement m = new MajorityElement();

    @Test
    public void majorityElement() {
        int[] nums = {3,2,3};
        Assert.assertEquals(3, m.majorityElement(nums));
    }
}