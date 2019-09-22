package easy;

import org.junit.Assert;
import org.junit.Test;

public class RomanToIntegerTest {
    RomanToInteger r = new RomanToInteger();

    @Test
    public void toIntegerTest() {
        Assert.assertEquals(r.romanToInt("III"), 3);
        Assert.assertEquals(r.romanToInt("IV"), 4);
        Assert.assertEquals(r.romanToInt("IX"), 9);
        Assert.assertEquals(r.romanToInt("LVIII"), 58);
    }
}
