package hard;

import static java.lang.Math.max;
import static java.lang.Math.min;

class MedianOfTwoSortedArrays {
    public double findMedianSortedArrays(int[] A, int[] B) {
        int m = A.length;
        int n = B.length;

        //make sure A is shorter than B, otherwise switch values
        if (m > n) {
            int[] temp = A;
            A = B;
            B = temp;
            m = A.length;
            n = B.length;
        }
        if (n == 0) {
            throw new IllegalArgumentException();
        }

        if (m == 0) {
            int halfLen = (n + 1) / 2;
            if (n % 2 == 1) {
                return B[halfLen - 1];
            } else {
                return (B[halfLen - 1] + B[halfLen]) / 2.0;
            }
        } else if (m == 1 && n == 1) {
            return (A[0] + B[0]) / 2.0;
        }

        int iMin = 0;
        int iMax = m;
        int halfLen = (m + n + 1) / 2;

        int leftMax = 0;
        int rightMin = 0;
        int i = 0;
        int j = 0;
        while (iMin <= iMax) {
            // index i is where to divide A int 2. i-1 belongs to right and i belongs to left.
            i = (iMin + iMax) / 2;

            // index j is where t divide B into to.
            // always make (ALeft + BLeft) == (ARight + BRight)(+1);
            // j-1 belongs to left and j belongs to right
            j = halfLen - 1;


            if (i < m && B[j - 1] < A[i]) {
                // when i is too small, increase it
                iMin = i + 1;

            } else if (i > 0 && A[i - 1] > B[j]) {
                // when i is too big, decrease it
                iMax = i - 1;
            } else { //here i is perfect, which means either we reached the edge of A/B
                if (i == 0) {
                    //when we reached the left edge of A.
                    leftMax = B[j - 1];
                } else if (j == 0) {
                    //when we reached the left edge of B.
                    leftMax = A[i - 1];
                } else {
                    leftMax = max(A[i - 1], B[j - 1]);
                }

                //if odd, leftMax is the medium number
                if ((m + n) % 2 == 1) {
                    return leftMax;
                }

                if (i == m) {
                    //when we reached the right edge of A
                    rightMin = B[j];
                } else if (j == n) {
                    //when we reached the right edge of B
                    rightMin = A[i];
                } else {
                    rightMin = min(A[i], B[j]);
                }
                return (leftMax + rightMin) / 2.0;
            }

        }

        return 0.0;
    }

}
