package easy;

import org.junit.Assert;
import org.junit.Test;

public class PalindromeNumberTest {
    PalindromeNumber p = new PalindromeNumber();

    @Test
    public void test() {
        Assert.assertTrue(p.isPalindrome(1234321));
        Assert.assertFalse(p.isPalindrome(23423414));
        Assert.assertTrue(p.isPalindrome(1));
    }
}
