package easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class ClimbingStairsTest {
    ClimbingStairs c = new ClimbingStairs();

    @Test
    public void climbStairs() throws Exception {
        assertEquals(c.climbStairs(4),5);
    }

    @Test
    public void climbStairs1() throws Exception {
        assertEquals(c.climbStairs(10),89);
    }

}