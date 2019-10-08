package easy;

import org.junit.Assert;
import org.junit.Test;

public class PlusOneTest {
    PlusOne p = new PlusOne();

    @Test
    public void test(){
        int[] array1 = new int[]{1,2,3,4};
        int[] array1Plus1 = new int[]{1,2,3,5};
        Assert.assertArrayEquals(p.plusOne(array1), array1Plus1);

        int[] array2 = new int[]{9,9,9,9};
        int[] array2Plus1 = new int[]{1,0,0,0,0};
        Assert.assertArrayEquals(p.plusOne(array2), array2Plus1);
    }
}
