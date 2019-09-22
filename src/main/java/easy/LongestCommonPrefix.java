package easy;

/**
 * Write a function to find the longest common prefix string amongst an array of strings.
 *
 * If there is no common prefix, return an empty string "".
 *
 * Example 1:
 *
 * Input: ["flower","flow","flight"]
 * Output: "fl"
 * Example 2:
 *
 * Input: ["dog","racecar","car"]
 * Output: ""
 * Explanation: There is no common prefix among the input strings.
 * Note:
 *
 * All given inputs are in lowercase letters a-z.
 */

class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        String prefix = "";
        if(strs.length == 0) return "";
        if(strs.length == 1) return strs[0];

        for(int i=0; i<strs[0].length();i++){
            char c = ' ';
            for(int j=0; j<strs.length ;j++) {
                if(j==0) c=strs[0].charAt(i);
                else if(strs[j].length() <= i || strs[j].charAt(i) != c){
                    return prefix;
                }
            }
            if(c != ' ') prefix += c;
        }
        return prefix;
    }
}
