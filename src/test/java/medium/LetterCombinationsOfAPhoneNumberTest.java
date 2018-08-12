package medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class LetterCombinationsOfAPhoneNumberTest {
    LetterCombinationsOfAPhoneNumber l = new LetterCombinationsOfAPhoneNumber();

    @Test
    public void letterCombinations() {
        l.letterCombinations("7");
        l.letterCombinations("34545");
    }
}