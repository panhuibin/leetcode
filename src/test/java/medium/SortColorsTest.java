package medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class SortColorsTest {

    SortColors s = new SortColors();

    @Test
    public void sortColors() {
        int[] nums = {1,2,0,1,2,0};
        s.sortColors(nums);
        System.out.println(nums);
    }


    @Test
    public void sortColors1() {
        int[] nums = {2,2,2,2,0,0,0,0,1,1,1,1};
        s.sortColors(nums);
        System.out.println(nums);
    }

    @Test
    public void sortColors2() {
        int[] nums = {1,0,2,1,0,1,2,2,0,1,2,0,1};
        s.sortColors(nums);
        System.out.println(nums);
    }

    @Test
    public void sortColors3() {
        int[] nums = {2,2,2,2,0,0,0,0,2,2,2,2};
        s.sortColors(nums);
        System.out.println(nums);
    }
}