package easy;

/**
 * Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.
 *
 * If the last word does not exist, return 0.
 *
 * Note: A word is defined as a character sequence consists of non-space characters only.
 */
class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        if(s.length() == 0) return 0;
        int length = 0;
        int lastLength = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == ' '){
                if(length!=0) lastLength = length;
                length = 0;
            }else{
                length ++;
            }
        }

        if(s.charAt((s.length()-1)) == ' '){
            return lastLength;
        }else{
            return length;
        }
    }
}
