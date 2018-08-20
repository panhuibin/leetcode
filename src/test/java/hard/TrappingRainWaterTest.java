package hard;

import org.junit.Assert;
import org.junit.Test;

public class TrappingRainWaterTest {
    TrappingRainWater t = new TrappingRainWater();

    @Test
    public void trap() throws Exception {
        int[] nums = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int waterVolume = t.trap(nums);
        Assert.assertEquals(waterVolume, 6);
    }

}