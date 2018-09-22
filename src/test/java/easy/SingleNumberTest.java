package easy;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SingleNumberTest {
    SingleNumber s = new SingleNumber();

    @Test
    public void singleNumber() {
        int[] nums = {2,2,1};
        Assert.assertEquals(1,s.singleNumber(nums));
    }
}