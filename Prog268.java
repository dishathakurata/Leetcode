package leetcode;

//268. Missing number

class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int t;
        
        for(int i=0;i<n-1;i++) {
            for(int j=i+1;j<n;j++) {
                if(nums[i]>nums[j]) {
                    t=nums[i];
                    nums[i]=nums[j];
                    nums[j]=t;
                }
            }
        }

        for(int k=0;k<n;k++) {
            if(nums[k]!=k) {
                return k;
            }
        }
        return n;
    }
}