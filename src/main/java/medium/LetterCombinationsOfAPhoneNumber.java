package medium;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/letter-combinations-of-a-phone-number/description/
 * Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent.
 * <p>
 * A mapping of digit to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.
 * <p>
 * <p>
 * <p>
 * Example:
 * <p>
 * Input: "23"
 * Output: ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
 * Note:
 * <p>
 * Although the above answer is in lexicographical order, your answer could be in any order you want.
 */
class LetterCombinationsOfAPhoneNumber {
    public List<String> letterCombinations(String digits) {
        int startingChar = Character.valueOf('a');
        List<String> currentStringList = new ArrayList<>();
        currentStringList.add("");
        for (int i = 0; i < digits.length(); i++) {
            for (String currentString : currentStringList) {
                int currentDigitStartingLetter = (Integer.valueOf(digits.charAt(i)) - 2) * 3 + startingChar;
                currentStringList.remove(currentString);
                currentStringList.add(currentString + Character.getName(currentDigitStartingLetter));
                currentStringList.add(currentString + Character.getName(currentDigitStartingLetter + 1));
                currentStringList.add(currentString + Character.getName(currentDigitStartingLetter + 2));
            }
        }
        return currentStringList;
    }
}
