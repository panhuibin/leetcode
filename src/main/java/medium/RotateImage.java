package medium;

/**
 * https://leetcode.com/problems/rotate-image/description/
 * You are given an n x n 2D matrix representing an image.
 * <p>
 * Rotate the image by 90 degrees (clockwise).
 * <p>
 * Note:
 * <p>
 * You have to rotate the image in-place, which means you have to modify the input 2D matrix directly. DO NOT allocate another 2D matrix and do the rotation.
 * <p>
 * Example 1:
 * <p>
 * Given input matrix =
 * [
 * [1,2,3],
 * [4,5,6],
 * [7,8,9]
 * ],
 * <p>
 * rotate the input matrix in-place such that it becomes:
 * [
 * [7,4,1],
 * [8,5,2],
 * [9,6,3]
 * ]
 * Example 2:
 * <p>
 * Given input matrix =
 * [
 * [ 5, 1, 9,11],
 * [ 2, 4, 8,10],
 * [13, 3, 6, 7],
 * [15,14,12,16]
 * ],
 * <p>
 * rotate the input matrix in-place such that it becomes:
 * [
 * [15,13, 2, 5],
 * [14, 3, 4, 1],
 * [12, 6, 8, 9],
 * [16, 7,10,11]
 * <p>
 * [1,  2,  3,  4,  5
 * 6,  7,  8,  9,  10
 * 11, 12, 13, 14, 15
 * 16, 17, 18, 19, 20
 * 21, 22, 23, 24, 25
 * ]
 * 21, 16, 11, 6,  1
 * 22, 17, 12, 7,  2
 * 23, 18, 13, 8,  3
 * 24, 19, 14, 9,  4
 * 25, 20, 15, 10, 5
 */
public class RotateImage {

    public void rotate(int[][] matrix) {
        if (matrix.length == 0) return;
        int imageWidth = matrix.length;
        int divisionLine;
        if(imageWidth%2==0){
            divisionLine = imageWidth/2;
        }else{
            divisionLine = imageWidth/2+1;
        }
        for (int i = 0; i < divisionLine; i++) {
            for (int j = 0; j < imageWidth / 2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[imageWidth - j - 1][i];
                matrix[imageWidth - j - 1][i] = matrix[imageWidth - i - 1][imageWidth - j - 1];
                matrix[imageWidth - i - 1][imageWidth - j - 1] = matrix[j][imageWidth - i - 1];
                matrix[j][imageWidth - i - 1] = temp;
            }
        }
    }
}
