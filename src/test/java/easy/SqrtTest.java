package easy;

import org.junit.Assert;
import org.junit.Test;

public class SqrtTest {
    Sqrt s = new Sqrt();

    @Test
    public void test(){
        Assert.assertEquals(s.mySqrt(4),2);
        Assert.assertEquals(s.mySqrt(8),2);
        Assert.assertEquals(s.mySqrt(9),3);
    }
}
