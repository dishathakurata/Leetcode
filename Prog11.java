package leetcode;

//11. Container with most water

class Solution {
    public int maxArea(int[] height) {
        int maxArea = 0;
        int curArea = 0;

        int l = 0;
        int r = height.length-1;

        while(l < r) {
            curArea = Math.min(height[l], height[r]) * (r - l);
            maxArea = Math.max(curArea, maxArea);

            if(height[l] < height[r]) {
                l++;
            }
            else {
                r--;
            }
        }

        return maxArea;
    }
}