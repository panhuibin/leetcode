package medium;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class WordBreakTest {

    WordBreak w = new WordBreak();

    @Test
    public void wordBreak1() {
        String s = "leetcode";
        List<String> words = new ArrayList();
        words.add("leet");
        words.add("code");
        Assert.assertTrue(w.wordBreak(s,words));
    }

    @Test
    public void wordBreak2() {
        String s = "applepenapple";
        List<String> words = new ArrayList();
        words.add("apple");
        words.add("pen");
        Assert.assertTrue(w.wordBreak(s,words));
    }

    @Test
    public void wordBreak3() {
        String s = "catsandog";
        List<String> words = new ArrayList();
        words.add("cats");
        words.add("dog");
        words.add("sand");
        words.add("and");
        words.add("cat");
        Assert.assertFalse(w.wordBreak(s,words));
    }

    @Test
    public void wordBreak4() {
        String s = "catsandog";
        List<String> words = new ArrayList();
        words.add("cats");
        words.add("dog");
        words.add("sand");
        words.add("and");
        words.add("cat");
        Assert.assertFalse(w.wordBreak(s,words));
    }
}