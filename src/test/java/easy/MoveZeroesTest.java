package easy;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MoveZeroesTest {

    MoveZeroes m = new MoveZeroes();

    @Test
    public void moveZeroes() {
        int[] nums = {1,2,0,4,0,0};
        m.moveZeroes(nums);
        int[] results = {1,2,4,0,0,0};
        Assert.assertArrayEquals(results,nums);
    }

    @Test
    public void moveZeroes1() {
        int[] nums = {0,1,0,3,12};
        m.moveZeroes(nums);
        int[] results = {1,3,12,0,0};
        Assert.assertArrayEquals(results,nums);
    }

    @Test
    public void moveZeroes2() {
        int[] nums = {0,0,1};
        m.moveZeroes(nums);
        int[] results = {1,0,0};
        Assert.assertArrayEquals(results,nums);
    }
}