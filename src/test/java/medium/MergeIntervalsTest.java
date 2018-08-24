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
        print(output);
    }

    @Test
    public void merge2() {
        List<Interval> intervals = new ArrayList<>();
        intervals.add(new Interval(1, 10));
        intervals.add(new Interval(2, 3));
        intervals.add(new Interval(4, 6));
        intervals.add(new Interval(3, 18));
        List<Interval> output = m.merge(intervals);
        print(output);
    }

    @Test
    public void merge3() {
        List<Interval> intervals = new ArrayList<>();
        intervals.add(new Interval(1, 1));
        intervals.add(new Interval(2, 2));
        List<Interval> output = m.merge(intervals);
        print(output);
    }

    @Test
    public void merge4() {
        List<Interval> intervals = new ArrayList<>();
        intervals.add(new Interval(1, 1));
        intervals.add(new Interval(1, 2));
        List<Interval> output = m.merge(intervals);
        print(output);
    }

    @Test
    public void merge5() {
        List<Interval> intervals = new ArrayList<>();
        intervals.add(new Interval(1, 3));
        intervals.add(new Interval(1, 2));
        List<Interval> output = m.merge(intervals);
        print(output);
    }

    @Test
    public void merge6() {
        List<Interval> intervals = new ArrayList<>();
        List<Interval> output = m.merge(intervals);
        print(output);
    }

    @Test
    public void merge7() {
        List<Interval> intervals = new ArrayList<>();
        intervals.add(new Interval(1, 4));
        intervals.add(new Interval(0, 0));
        List<Interval> output = m.merge(intervals);
        print(output);
    }

    private void print(List<Interval> intervals) {
        for (Interval interval : intervals) {
            System.out.println("[" + interval.start + "," + interval.end + "]");
        }
    }
}