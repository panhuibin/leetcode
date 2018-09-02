package easy;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/climbing-stairs/description/
 * You are climbing a stair case. It takes n steps to reach to the top.
 * <p>
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 * <p>
 * Note: Given n will be a positive integer.
 * <p>
 * Example 1:
 * <p>
 * Input: 2
 * Output: 2
 * Explanation: There are two ways to climb to the top.
 * 1. 1 step + 1 step
 * 2. 2 steps
 * Example 2:
 * <p>
 * Input: 3
 * Output: 3
 * Explanation: There are three ways to climb to the top.
 * 1. 1 step + 1 step + 1 step
 * 2. 1 step + 2 steps
 * 3. 2 steps + 1 step
 */
public class ClimbingStairs {
    public int climbStairs(int n) {
        //this is a fibonachhi question.
        //n==1, result = 1(1)
        //n==2, result = 2(1+1, 2)
        //n==3, result = 2+1(1+1+1,2+1,1+2) (because we can add 1 step at the end of n-1 combination,
        //and we can add 2 steps at the end of n-2 combination, that's all the new combination is)
        //n==4, result = 3+2(1+1+1+1,2+1+1,1+2+1,1+1+2,2+2)

        if(n==0) return 0;
        int combinationSumNMinus1 = 1;
        int combinationSumNMinus2 = 0;
        for(int i=1;i<=n;i++){
            int temp = combinationSumNMinus2;
            combinationSumNMinus2 = combinationSumNMinus1;
            combinationSumNMinus1 += temp;
        }
        return combinationSumNMinus1;
    }


}
