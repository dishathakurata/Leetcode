package leetcode;

import java.util.HashSet;
import java.util.Set;

//3. Longest substring without repeating characters

class Solution {
  public int lengthOfLongestSubstring(String s) {
      Set<Character> set = new HashSet<>();
      int max = 0;
      int l = 0;

      for(int r = 0; r < s.length(); r++) {
          char c = s.charAt(r);
          while(set.contains(c)) {
              set.remove(s.charAt(l));
              l++;
          }
          set.add(c);

          int len = r - l + 1;
          max = Math.max(max, len);
      }

      return max;
  }
}