package hard;

/**
 * https://leetcode.com/problems/regular-expression-matching/description/
 * Given an input string (s) and a pattern (p), implement regular expression matching with support for '.' and '*'.
 * <p>
 * '.' Matches any single character.
 * '*' Matches zero or more of the preceding element.
 * The matching should cover the entire input string (not partial).
 * <p>
 * Note:
 * <p>
 * s could be empty and contains only lowercase letters a-z.
 * p could be empty and contains only lowercase letters a-z, and characters like . or *.
 */

class RegularExpressionMatching {

    //recursively call isMatch. do one char at a time.
    public boolean isMatch(String text, String pattern) {
        // if pattern
        if(pattern.isEmpty()){
            return text.isEmpty();
        }

        boolean firstMatch = (!text.isEmpty()) &&
                (pattern.charAt(0) == text.charAt(0) ||
                        pattern.charAt(0) == Character.valueOf('.')
                );

        if(pattern.length()>=2 && pattern.charAt(1)==Character.valueOf('*')){
            //remove the * part and check if it matches
            return isMatch(text,pattern.substring(2)) ||
                    (firstMatch && isMatch(text.substring(1),pattern));
        }else{
            return firstMatch && isMatch(text.substring(1), pattern.substring(1));
        }
    }

}
