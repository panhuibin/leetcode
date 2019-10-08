package easy;

import org.junit.Assert;
import org.junit.Test;

public class LengthOfLastWordTest {

    LengthOfLastWord l = new LengthOfLastWord();

    @Test
    public void test(){
        Assert.assertEquals(l.lengthOfLastWord("Hello World"), 5);
        Assert.assertEquals(l.lengthOfLastWord("b   a    "), 1);
    }
}
