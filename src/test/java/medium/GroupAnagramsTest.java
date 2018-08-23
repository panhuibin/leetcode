package medium;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class GroupAnagramsTest {

    GroupAnagrams g = new GroupAnagrams();

    @Test
    public void groupAnagrams() {
        String[] input = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> output = g.groupAnagrams(input);
        print(output);
    }

    @Test
    public void groupAnagrams2() {
        String[] input = {"boo", "bob"};
        List<List<String>> output = g.groupAnagrams(input);
        print(output);
    }

    private void print(List<List<String>> list){
        list.forEach(entry -> {
            entry.forEach(string -> System.out.print(string+","));
            System.out.print("\n");
        });
    }
}