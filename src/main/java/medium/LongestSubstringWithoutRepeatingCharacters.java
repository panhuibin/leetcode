package medium;

import java.util.HashSet;
import java.util.Set;

class LongestSubstringWithoutRepeatingCharacters {

    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0){
            return 0;
        }else {
            int tempLongest = 1;
            Set<Character> charactersSet;
            for (int i = 0; i < s.length() - 1; i++) {
                charactersSet = new HashSet<>();
                charactersSet.add(s.charAt(i));
                for (int j = i + 1; j < s.length(); j++) {
                    if (charactersSet.contains(s.charAt(j))) {
                        break;
                    } else {
                        charactersSet.add(s.charAt(j));
                        tempLongest = Math.max(charactersSet.size(), tempLongest);
                    }
                }
            }
            return tempLongest;
        }
    }

}
