package medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ContainerWithMostWaterTest {
    ContainerWithMostWater c = new ContainerWithMostWater();

    @Test
    public void maxArea() {
        int[] t = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        assertEquals(c.maxArea(t), 49);
    }
}