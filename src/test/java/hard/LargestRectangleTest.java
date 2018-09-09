package hard;

import org.junit.Test;

public class LargestRectangleTest {
    LargestRectangle l = new LargestRectangle();

    @Test
    public void maximalRectangle() {
        char[][] heights =
                       {{'1', '0', '1', '0', '0'},
                        {'1', '0', '1', '1', '1'},
                        {'1', '1', '1', '1', '1'},
                        {'1', '0', '0', '1', '0'}};
        int maxarea = l.maximalRectangle(heights);
        assert(maxarea==6);
    }
}