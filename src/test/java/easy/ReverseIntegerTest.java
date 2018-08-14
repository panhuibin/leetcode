package easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseIntegerTest {

    ReverseInteger r = new ReverseInteger();

    @Test
    public void reverse() throws Exception {
        //r.reverse(12345);
        //r.reverse(0);
        r.reverse(-1);
        r.reverse(Integer.MIN_VALUE);
    }

}