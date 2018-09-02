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
public class ClimbingStairs2 {
    public int climbStairs(int n) {
        //the first one is 1 step for every step
        //the first round is combining 2
        //the last one is 2 steps for almost every step
        List<List<String>> climbWays = new ArrayList();
        List<String> climbWay = new ArrayList();
        for (int i = 0; i < n; i++) {
            climbWay.add("1 step");
        }
        climbWays.add(climbWay);
        climb(climbWays, climbWays);
        print(climbWays);
        return climbWays.size();
    }

    private void climb(List<List<String>> totalClimbWays, final List<List<String>> climbWaysToDealWith) {
        List<List<String>> nextClimbWaysToDealWith = new ArrayList();
        for (final List<String> climbWay : climbWaysToDealWith) {
            for (int i = 0; i < climbWay.size() - 1; i++) {
                if (climbWay.get(i).equals("1 step") && climbWay.get(i + 1).equals("1 step")) {
                    List<String> newWay = new ArrayList(climbWay);
                    newWay.remove(i + 1);
                    newWay.remove(i);
                    newWay.add(i, "2 steps");
                    if(!nextClimbWaysToDealWith.contains(newWay))
                        nextClimbWaysToDealWith.add(newWay);
                }
            }
        }
        if (nextClimbWaysToDealWith.size() == 0) return;
        totalClimbWays.addAll(nextClimbWaysToDealWith);
        climb(totalClimbWays, nextClimbWaysToDealWith);
    }

    private void print(List<List<String>> climbWays){
        climbWays.forEach(climbWay -> {climbWay.forEach(step -> System.out.print(step+","));
            System.out.print("\n");
        });
    }
}
