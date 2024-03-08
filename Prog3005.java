package leetcode;

//3005. Count elements with maximum frequency

import java.util.HashMap;
import java.util.Map;

class Solution {
	
    public int maxFrequencyElements(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();
        int max = 0;
        int count = 0;

        for(int i = 0; i < nums.length; i++) {
            if(freq.containsKey(nums[i])) {
                freq.put(nums[i], freq.get(nums[i]) + 1);
            }
            else {
                freq.put(nums[i], 1);
            }

            max = Math.max(max, freq.get(nums[i]));
        }

        for(Map.Entry<Integer, Integer> freqElement : freq.entrySet()) {
            if(freqElement.getValue() == max) {
                count++;
            }
        }

        return count * max;
    }
}