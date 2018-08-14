package medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class ZigZagConversionTest {

    ZigZagConversion z = new ZigZagConversion();

    @Test
    public void convertTest(){
        String s = z.convert("PAYPALISHIRING",2);
        s = z.convert("PAYPALISHIRING",3);
        assertEquals(s, "PAHNAPLSIIGYIR");
        s = z.convert("PAYPALISHIRING",4);
        assertEquals(s, "PINALSIGYAHRPI");
        z.convert("PAYPALISHIRING",1);
        assertEquals(s, "PAYPALISHIRING");
        z.convert("PAYPALISHIRING",15);
        assertEquals(s, "PAYPALISHIRING");

    }

}