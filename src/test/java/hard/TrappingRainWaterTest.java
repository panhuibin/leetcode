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

    @Test
    public void trap2() throws Exception {
        int[] nums = {3, 2, 1, 2, 1};
        int waterVolume = t.trap(nums);
        Assert.assertEquals(waterVolume, 1);
    }

    @Test
    public void trap3() throws Exception {
        int[] nums = {1, 2, 3};
        int waterVolume = t.trap(nums);
        Assert.assertEquals(waterVolume, 0);
    }

    @Test
    public void trap4() throws Exception {
        int[] nums = {5, 4, 1, 2};
        int waterVolume = t.trap(nums);
        Assert.assertEquals(waterVolume, 0);
    }

    @Test
    public void trap5() throws Exception {
        int[] nums = {5, 2, 1, 2, 1, 5};
        int waterVolume = t.trap(nums);
        Assert.assertEquals(waterVolume, 14);
    }


    @Test
    public void trap6() throws Exception {
        int[] nums = {5, 2, 1, 2, 4, 2, 3, 4};
        int waterVolume = t.trap(nums);
        Assert.assertEquals(waterVolume, 10);
    }

    @Test
    public void trap7() throws Exception {
        int[] nums = {5, 2, 1, 2, 3, 6, 2, 3, 4};
        int waterVolume = t.trap(nums);
        Assert.assertEquals(waterVolume, 13);
    }


    @Test
    public void trap8() throws Exception {
        int[] nums = {5,5,1,7,1,1,5,2,7,6};
        int waterVolume = t.trap(nums);
        Assert.assertEquals(waterVolume, 23);
    }

}