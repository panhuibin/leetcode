package easy;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class BestTimeToBuyAndSellStockTest {
    BestTimeToBuyAndSellStock b = new BestTimeToBuyAndSellStock();

    @Test
    public void maxProfit() {
        int[] nums = {7,1,5,3,6,4};
        Assert.assertEquals(5,b.maxProfit(nums));
    }
}