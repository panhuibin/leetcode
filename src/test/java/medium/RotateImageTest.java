package medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class RotateImageTest {

    RotateImage r = new RotateImage();

    @Test
    public void rotate() throws Exception {
        int[][] matrix = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
        print(matrix);
        r.rotate(matrix);
        print(matrix);
    }

    private void print(int[][] nums){
        for(int[] numLine:nums){
            for(int num:numLine){
                System.out.print(num+",");
            }
            System.out.print("\n");
        }
    }

    @Test
    public void rotate2() throws Exception {
        int[][] matrix = {{1,2},{3, 4}};
        print(matrix);
        r.rotate(matrix);
        print(matrix);
    }

    @Test
    public void rotate3() throws Exception {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        print(matrix);
        r.rotate(matrix);
        print(matrix);
    }

    @Test
    public void rotate4() throws Exception {
        int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        print(matrix);
        r.rotate(matrix);
        print(matrix);
    }

    @Test
    public void rotate5() throws Exception {
        int[][] matrix = {{1}};
        print(matrix);
        r.rotate(matrix);
        print(matrix);
    }

}