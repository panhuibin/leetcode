package easy;

import org.junit.Assert;
import org.junit.Test;

public class AddBinaryTest {

    AddBinary a = new AddBinary();

    @Test
    public void test(){
        Assert.assertEquals(a.addBinary("11","1"),"100");
        Assert.assertEquals(a.addBinary("1010", "1011"), "10101");
    }
}
