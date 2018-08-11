package medium;

/**
 * https://leetcode.com/problems/longest-palindromic-substring/description/
 * Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.
 * <p>
 * Example 1:
 * <p>
 * Input: "babad"
 * Output: "bab"
 * Note: "aba" is also a valid answer.
 * Example 2:
 * <p>
 * Input: "cbbd"
 * Output: "bb"
 */
class LongestPalindromicSubstring {
    public String longestPalindrome(String s) {
        if (s.length() == 0) {
            return s;
        } else if (s.length() == 1) {
            return s;
        } else if (s.length() == 2) {
            if (s.charAt(0) == s.charAt(1)) {
                return s;
            } else {
                return s.substring(0, 1);
            }
        }
        String longest = s.substring(0, 1);
        // for loop when the string has >=3 chars
        // i is the folding place
        for (int i = 1; i < s.length(); i++) {
            // no need to check if the leftover string is shorter than the longest found string
            // if it's an even palindromic
            if (s.charAt(i) == s.charAt(i - 1)) {
                longest = longest.length() < 2 ? s.substring(i - 1, i + 1) : longest;
                for (int j = 2; (i - j) >= 0 && (i + j - 1) < s.length(); j++) {
                    if (s.charAt(i - j) == s.charAt(i + j - 1)) {
                        longest = j * 2 >= longest.length() ? s.substring(i - j, i + j) : longest;
                    } else {
                        //palindromic ends
                        break;
                    }
                }
            }
            int j;
            for (j = 1; (i - j) >= 0 && i + j < s.length(); j++) {
                if (s.charAt(i - j) == s.charAt(i + j)) {
                    longest = j * 2 + 1 >= longest.length() ? s.substring(i - j, i + j + 1) : longest;
                } else {
                    //palindromic ends
                    break;
                }
            }
        }
        return longest;
    }

}
