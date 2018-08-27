package medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MinimumPathSumTest {
    MinimumPathSum m = new MinimumPathSum();

    @Test
    public void minPathSum() throws Exception {
        int[][] grid = {{1, 3, 1}, {1, 5, 1}, {4, 2, 1}};
        assertEquals(7, m.minPathSum(grid));
    }

}