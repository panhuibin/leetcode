package medium;

import org.junit.Assert;
import org.junit.Test;

public class JumpGameTest {

    JumpGame j = new JumpGame();

    @Test
    public void canJump() {
        int[] nums = {2, 3, 1, 1, 4};
        Assert.assertTrue(j.canJump(nums));
    }

    @Test
    public void canJump1() {
        int[] nums = {3, 2, 1, 0, 4};
        Assert.assertFalse(j.canJump(nums));
    }
}