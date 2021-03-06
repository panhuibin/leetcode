package easy;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/majority-element/
 * Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.
 *
 * You may assume that the array is non-empty and the majority element always exist in the array.
 *
 * Example 1:
 *
 * Input: [3,2,3]
 * Output: 3
 * Example 2:
 *
 * Input: [2,2,1,1,1,2,2]
 * Output: 2
 */
class MajorityElement {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> eventCountMap = new HashMap();
        int count = 0;
        for(int i=0;i<nums.length;i++){
            if(eventCountMap.get(nums[i])!=null){
                count = eventCountMap.get(nums[i]);
                eventCountMap.put(nums[i],count+1);
            }else{
                eventCountMap.put(nums[i],1);
            }
        }
        for(int key : eventCountMap.keySet()){
            count = eventCountMap.get(key);
            if(count>nums.length/2){
                return key;
            }
        }
        return count;
    }
}
