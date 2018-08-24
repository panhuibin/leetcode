package medium;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import module.Interval;


public class MergeIntervalsTest {

    MergeIntervals m = new MergeIntervals();

    @Test
    public void merge() {
        List<Interval> intervals = new ArrayList<>();
        intervals.add(new Interval(1, 3));
        intervals.add(new Interval(2, 6));
        intervals.add(new Interval(8, 10));
        intervals.add(new Interval(15, 18));
        List<Interval> output = m.merge(intervals);

    }

    private void print(List<Interval> intervals) {
        for (Interval interval : intervals) {
            System.out.println("[" + interval.start + "," + interval.end + "]");
        }
    }
}