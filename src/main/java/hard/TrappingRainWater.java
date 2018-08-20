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

        return -1;
        int volume = 0;
        return trapRecursively(false, heights, volume);

    }

    private int trapRecursively(boolean ispeak, int[] heights, int volume) {
        //water can only be contained when heights has at least 3 items
        if (heights.length < 3) return volume;
        int firstPeak = -1;
        int firstPeakIndex = -1;
        if (!ispeak) {
            for (int i = 0; i < heights.length - 1; i++) {
                if (heights[i] > heights[i + 1]) {
                    //this is the peak;
                    firstPeakIndex = i;
                    firstPeak = heights[i];
                }
            }
        } else {
            firstPeakIndex = 0;
            firstPeak = heights[0];
        }

        //if firstPeakIndex ==-1, then there's no up and down. it's just up up up up or
        if (firstPeakIndex == -1) return volume;

        int secondPeak = -1;
        int secondPeakIndex = -1;
        for (int i = 1; i < heights.length - 1; i++) {
            if (heights[i] < heights[i + 1]) {
                secondPeakIndex = i + 1;
                secondPeak = heights[i + 1];
            }
        }

        // if secondPeakIndex=-1, then there's just down down down down down
        if (secondPeakIndex == -1) return volume;

        int waterHeight = Math.min(firstPeak, secondPeak);

        for (int i = firstPeakIndex + 1; i < secondPeakIndex; i++) {
            volume += waterHeight - heights[i];
        }

        int heightWidth = secondPeakIndex - firstPeakIndex;

        int[] leftOverHeights = new int[heights.length - heightWidth];
        System.arraycopy(heights, secondPeakIndex, leftOverHeights, 0, heights.length - heightWidth);
        return trapRecursively(false, leftOverHeights, volume);
    }
}
