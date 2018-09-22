package hard;

import java.util.HashMap;
import java.util.Map;

class LongestConsecutiveSequence {

    public int longestConsecutive(int[] nums) {
        int maxCon = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int val = nums[i];
            int left = 0;
            int right = 0;
            if(map.containsKey(val)) continue;
            if (map.containsKey(val - 1)) {
                left = map.get(val - 1);
            }
            if (map.containsKey(val + 1)) {
                right = map.get(val + 1);
            }
            int current = left + 1 + right;
            for(int j=val-left;j<=val+right;j++) {
                map.put(j, current);
                map.put(j, current);
            }
            maxCon = Math.max(current, maxCon);
        }
        return maxCon;

    }
}
