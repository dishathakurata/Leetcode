package leetcode;

//2864. Maximum odd binary number

class Solution {
    public String maximumOddBinaryNumber(String s) {
        StringBuilder st = new StringBuilder();
        int ones = 0;

        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '1') {
                ones++;
            }
        }

        int zeros = s.length() - ones;

        for(int i = 0; i< (ones - 1); i++) {
            st.append("1");
        }

        for(int i = 0; i< zeros; i++) {
            st.append("0");
        }

        st.append("1");

        return st.toString();
    }
}