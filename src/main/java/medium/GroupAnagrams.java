package medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * https://leetcode.com/problems/group-anagrams/description/
 * Given an array of strings, group anagrams together.
 * <p>
 * Example:
 * <p>
 * Input: ["eat", "tea", "tan", "ate", "nat", "bat"],
 * Output:
 * [
 * ["ate","eat","tea"],
 * ["nat","tan"],
 * ["bat"]
 * ]
 * Note:
 * <p>
 * All inputs will be in lowercase.
 * The order of your output does not matter.
 */
class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<Map<Character,Integer>, List<String>> setToListMap = new HashMap();
        List<List<String>> groups = new ArrayList<>();
        for (String str : strs) {
            Map<Character,Integer> countMap = new HashMap<>();
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                if(countMap.get(c)!=null){
                    int count = countMap.get(str.charAt(i));
                    count++;
                    countMap.put(c,count);
                }else{
                    countMap.put(c,1);
                }
            }
            if (setToListMap.get(countMap) != null) {
                List<String> entry = setToListMap.get(countMap);
                entry.add(str);
                setToListMap.put(countMap, entry);
            } else {
                List<String> entry = new ArrayList<>();
                entry.add(str);
                setToListMap.put(countMap, entry);
            }
        }

        setToListMap.forEach((k,v)->groups.add(v));
        return groups;

    }
}
