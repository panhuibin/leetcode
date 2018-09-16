package easy;

import java.util.Stack;

class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            for(int j=0;j<i;j++){
                maxProfit= Math.max(maxProfit,prices[i]-prices[j]);
            }

        }
        return maxProfit;
    }
}
