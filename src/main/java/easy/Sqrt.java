package easy;

/**
 * Compute and return the square root of x, where x is guaranteed to be a non-negative integer.
 *
 * Since the return type is an integer, the decimal digits are truncated and only the integer part of the result is returned.
 */

class Sqrt {

    public int mySqrt(int x) {
        if(x == 0 ) return 0;
        if(x == 1 ) return 1;
        for(int i=0;i<=x;i++){
            if(i*i > x) return i-1;
        }
        return 0;
    }

}
