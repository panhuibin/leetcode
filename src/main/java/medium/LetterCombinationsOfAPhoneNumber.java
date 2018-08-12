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
        if (digits.length() == 0) {
            return currentStringList;
        }
        currentStringList.add("");
        for (int i = 0; i < digits.length(); i++) {
            List<String> newStringList = new ArrayList<>();
            for (int j = 0; j < currentStringList.size(); j++) {
                String currentString = currentStringList.get(j);
                int currentDigit = Integer.valueOf(String.valueOf(digits.charAt(i)));
                int currentDigitStartingLetter;
                if (currentDigit <= 7)
                    currentDigitStartingLetter = (currentDigit - 2) * 3 + startingChar;
                else
                    currentDigitStartingLetter = (currentDigit - 2) * 3 + 1 + startingChar;
                newStringList.add(currentString + String.valueOf((char) currentDigitStartingLetter));
                newStringList.add(currentString + String.valueOf((char) (currentDigitStartingLetter + 1)));
                newStringList.add(currentString + String.valueOf((char) (currentDigitStartingLetter + 2)));
                if (currentDigit == 7 || currentDigit == 9) {
                    newStringList.add(currentString + String.valueOf((char) (currentDigitStartingLetter + 3)));
                }
            }
            currentStringList = newStringList;
        }
        return currentStringList;
    }
}
