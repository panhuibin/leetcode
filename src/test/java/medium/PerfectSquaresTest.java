package medium;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PerfectSquaresTest {

    PerfectSquares p = new PerfectSquares();

    @Test
    public void numSquares() {

        Assert.assertEquals(3,p.numSquares(12));
    }

    @Test
    public void numSquares1() {
        Assert.assertEquals(1, 25);
    }
}