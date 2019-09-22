package easy;

import org.junit.Assert;
import org.junit.Test;

public class RemoveDuplicatesFromSortedArrayTest {
    RemoveDuplicatesFromSortedArray r = new RemoveDuplicatesFromSortedArray();

    @Test
    public void test(){
        int[] array1 = new int[]{1,1,2};
        int[] array2 = new int[]{0,0,1,1,1,2,2,3,3,4};
        Assert.assertEquals(r.removeDuplicates(array1),2);
        Assert.assertEquals(r.removeDuplicates(array2),5);
    }
}
