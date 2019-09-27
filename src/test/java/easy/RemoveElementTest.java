package easy;

import org.junit.Assert;
import org.junit.Test;


public class RemoveElementTest {
    RemoveElement r = new RemoveElement();

    @Test
    public void test(){
        int[] array1 = new int[]{3,2,2,3};
        int[] array2 = new int[]{0,1,2,2,3,0,4,2};
        int[] array3 = new int[]{4,4,0,1,0,2};
        Assert.assertEquals(r.removeElement(array3,0),4);
        Assert.assertEquals(r.removeElement(array2, 2), 5);
        Assert.assertEquals(r.removeElement(array1,3),2);

    }

}
