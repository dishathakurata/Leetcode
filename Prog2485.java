package leetcode;

//2485. Find the pivot integer

class Solution {
    public int pivotInteger(int n) {
        int y = (n * (n + 1)) / 2;
        int x = (int)Math.sqrt(y);

        if((x * x) == y) {
            return x;
        }

        return -1;
    }
}