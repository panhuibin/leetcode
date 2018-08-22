package hard;

/**
 * https://leetcode.com/problems/trapping-rain-water/description/
 * <p>
 * Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it is able to trap after raining.
 * <p>
 * <p>
 * The above elevation map is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain water (blue section) are being trapped. Thanks Marcos for contributing this image!
 * <p>
 * Example:
 * <p>
 * Input: [0,1,0,2,1,0,1,3,2,1,2,1]
 * Output: 6
 */
public class TrappingRainWater {


    public int trap(int[] heights) {
        //find the peak and and bottom and peak and bottom and calculate the volume of water inside
        //for the example input, 0->1->:peak1
        //0->2->1: peak2
        //calculate the volume between peak1 and peak2:
        //min(peak1,peak2)==height
        //for each node (peak1+1)->(peak2-1) volume+=(height-nums[j])
        //keep the record of previous peak and recursively find next peak

        return trapRecursively(heights, 0);
    }

    private int trapRecursively(int[] heights, int volume) {
        //water can only be contained when heights has at least 3 items
        if (heights.length < 3) return volume;
        int[] peaks = findPeaks(heights);
        int leftPeakIndex = peaks[0];
        int rightPeakIndex = peaks[1];
        if (leftPeakIndex == -1 || rightPeakIndex == -1) return volume;

        int waterHeight = Math.min(heights[leftPeakIndex], heights[rightPeakIndex]);

        for (int i = leftPeakIndex + 1; i < rightPeakIndex; i++) {
            volume += Math.max(0, waterHeight - heights[i]);
        }

        int[] leftOverHeights = new int[heights.length - rightPeakIndex];
        System.arraycopy(heights, rightPeakIndex, leftOverHeights, 0, heights.length - rightPeakIndex);
        return trapRecursively(leftOverHeights, volume);
    }

    public int[] findPeaks(int nums[]) {
        int leftPeak = -1;
        int rightPeak = -1;

        for (int i = 1; i < nums.length - 1; i++) {

            if ((nums[i] > nums[i - 1]) && (nums[i] > nums[i + 1])) {
                if (leftPeak == -1) leftPeak = i;
                else rightPeak = i;
            }

            if (leftPeak != -1 && rightPeak != -1 && nums[rightPeak] >= nums[leftPeak]) {
                return new int[]{leftPeak, rightPeak};
            }
        }
        if (nums[nums.length - 2] < nums[nums.length - 1]) {
            if (leftPeak == -1) leftPeak = nums.length - 1;
            else if (rightPeak == -1) rightPeak = nums.length - 1;
            else if (nums[nums.length - 1] > nums[rightPeak]) rightPeak = nums.length - 1;
        }
        return new int[]{leftPeak, rightPeak};
    }

}
