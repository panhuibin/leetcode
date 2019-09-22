package easy;

import com.sun.xml.internal.xsom.impl.scd.Iterators;

import org.junit.Assert;
import org.junit.Test;

public class LongestCommonPrefixTest {
    LongestCommonPrefix l = new LongestCommonPrefix();

    @Test
    public void test() {
        String[] array1 = new String[]{"flower","flow","flight"};
        Assert.assertEquals(l.longestCommonPrefix(array1), "fl");
        String[] array2 = new String[] {"dog","racecar","car"};
        Assert.assertEquals(l.longestCommonPrefix(array2), "");
    }

}
