package easy;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class HouseRobberTest {

    HouseRobber h = new HouseRobber();

    @Test
    public void rob1() {
        int[] nums = {1,2,3,1};
        Assert.assertEquals(4, h.rob(nums));
    }

    @Test
    public void rob2() {
        int[] nums = {2,7,9,3,1};
        Assert.assertEquals(12, h.rob(nums));
    }

    @Test
    public void rob3() {
        int[] nums = {2,7,9,3,1,5,4,3,4,5};
        Assert.assertEquals(12, h.rob(nums));
    }
}