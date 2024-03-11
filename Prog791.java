package leetcode;

//791. Custom sort string

import java.util.HashMap;
import java.util.Map;

class Solution {
    public String customSortString(String order, String s) {
    	
        Map<Character, Integer> map = new HashMap<>();
        StringBuilder res = new StringBuilder();
        int j = 0;

        for(int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        while(j < order.length()) {
            if(map.containsKey(order.charAt(j))) {
                int n = map.get(order.charAt(j));

                for(int k = 0; k < n; k++) {
                    res.append(order.charAt(j));
                    map.remove(order.charAt(j));
                }
            }

            j++;
        }

        for(Character key: map.keySet()) {
            int n = map.get(key);

                for(int k = 0; k < n; k++) {
                    res.append(key);
                }
        }

        return res.toString();
    }
}