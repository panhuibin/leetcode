package easy;

/**
 * https://leetcode.com/problems/reverse-integer/description/
 * Given a 32-bit signed integer, reverse digits of an integer.
 * <p>
 * Example 1:
 * <p>
 * Input: 123
 * Output: 321
 * Example 2:
 * <p>
 * Input: -123
 * Output: -321
 * Example 3:
 * <p>
 * Input: 120
 * Output: 21
 * Note:
 * Assume we are dealing with an environment which could only store integers within the 32-bit signed integer range: [−231,  231 − 1].
 * For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.
 */

public class ReverseInteger {
    public int reverse(int x) {
        long reverseNum = 0;
        while (x != 0) {
            reverseNum = reverseNum * 10 + x % 10;
            x = x / 10;
        }
        if (reverseNum > 0 && reverseNum > Integer.MAX_VALUE) {
            return 0;
        } else if (reverseNum < 0 && reverseNum < Integer.MIN_VALUE) {
            return 0;
        } else {
            return (int) reverseNum;
        }
    }
}
