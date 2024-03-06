package leetcode;

//141. Linked list cycle

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode slowp = head;
        ListNode fastp = head;

        while(slowp != null && fastp != null && fastp.next != null) {
            fastp = fastp.next.next;
            slowp = slowp.next;

            if(fastp == slowp) {
                return true;
            }
        }

        return false;
    }
}