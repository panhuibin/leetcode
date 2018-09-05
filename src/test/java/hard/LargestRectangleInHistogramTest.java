package hard;

import org.junit.Assert;
import org.junit.Test;

public class LargestRectangleInHistogramTest {

    LargestRectangleInHistogram l = new LargestRectangleInHistogram();

    @Test
    public void largestRectangleArea() {
        int hist[] = {6, 2, 5, 4, 5, 1, 6};
        Assert.assertEquals(12, l.largestRectangleArea(hist));
    }


    @Test
    public void largestRectangleArea1() {
        int hist[] = {6, 2, 5, 4, 3, 2, 5, 1, 6};
        Assert.assertEquals(12, l.largestRectangleArea(hist));
    }
}