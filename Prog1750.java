package leetcode;

//1750. Minimum length of string after deleting similar ends

class Solution {
    public int minimumLength(String s) {
        int end = s.length() - 1;
        int start = 0;

        while(start < end && s.charAt(start) == s.charAt(end)) {
            char c = s.charAt(start);

            while(start <= end && s.charAt(start) == c) {
                start++;
            }

            while(end > start && s.charAt(end) == c) {
                end--;
            }
        }

        int minLen = end - start + 1;
        return minLen;
    }
}