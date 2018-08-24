package medium;

/**
 * https://leetcode.com/problems/merge-intervals/description/
 * Given a collection of intervals, merge all overlapping intervals.
 * <p>
 * Example 1:
 * <p>
 * Input: [[1,3],[2,6],[8,10],[15,18]]
 * Output: [[1,6],[8,10],[15,18]]
 * Explanation: Since intervals [1,3] and [2,6] overlaps, merge them into [1,6].
 * Example 2:
 * <p>
 * Input: [[1,4],[4,5]]
 * Output: [[1,5]]
 * Explanation: Intervals [1,4] and [4,5] are considerred overlapping.
 */

import java.util.ArrayList;
import java.util.List;

import module.Interval;

/**
 * Definition for an interval.
 * public class Interval {
 * int start;
 * int end;
 * Interval() { start = 0; end = 0; }
 * Interval(int s, int e) { start = s; end = e; }
 * }
 */
public class MergeIntervals {
    public List<Interval> merge(List<Interval> intervals) {
        List<Interval> sortedIntervals = new ArrayList<>();
        for (Interval interval : intervals) {
            List<Interval> intervalsToRemove = new ArrayList<>();
            for (Interval intervalInArray : sortedIntervals) {
                if (isOverlapping(intervalInArray, interval)) {
                    interval = joinInterval(intervalInArray, interval);
                    intervalsToRemove.add(intervalInArray);
                }
            }
            sortedIntervals.removeAll(intervalsToRemove);
            sortedIntervals.add(interval);
        }
        return sortedIntervals;
    }

    private boolean isOverlapping(Interval first, Interval second) {
        if(first.end<second.start) return false;
        else if(first.start>second.end) return false;
        else return true;
    }

    private Interval joinInterval(Interval first, Interval second) {
        int start = Math.min(first.start, second.start);
        int end = Math.max(first.end, second.end);
        return new Interval(start, end);
    }

}
