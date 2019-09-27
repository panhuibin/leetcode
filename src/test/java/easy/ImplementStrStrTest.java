package easy;

import org.junit.Assert;
import org.junit.Test;

public class ImplementStrStrTest {
    ImplementStrStr i = new ImplementStrStr();

    @Test
    public void test(){
        Assert.assertEquals(i.strStr("hello","ll"),2);
        Assert.assertEquals(i.strStr("aaaaaaaa", "bba"), -1);
    }
}
