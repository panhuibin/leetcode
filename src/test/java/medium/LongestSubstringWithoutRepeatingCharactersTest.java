package medium;

import org.junit.Assert;
import org.junit.Test;

public class LongestSubstringWithoutRepeatingCharactersTest {

    @Test
    public void lengthOfLongestSubstring() {
        String a = "abcabcbbs";
        LongestSubstringWithoutRepeatingCharacters longestSubstringWithoutRepeatingCharacters = new LongestSubstringWithoutRepeatingCharacters();
        Assert.assertEquals(longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(a), 3);
        String b = "bbbbb";
        Assert.assertEquals(longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(b), 1);
        String c = "pwwkew";
        Assert.assertEquals(longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(c), 3);
        String d = "";
        Assert.assertEquals(longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(d), 0);
    }
}