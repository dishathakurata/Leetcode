package leetcode;

//876. Middle of the linked list

public class ListNode {
    int val;
    ListNode next;
    
    ListNode() {}
    
    ListNode(int val) { 
    	this.val = val; 
    
    }
    
    ListNode(int val, ListNode next) { 
    	this.val = val; 
    	this.next = next; 
    }
}

class Solution {

    public ListNode middleNode(ListNode head) {
        ListNode slowp = head;
        ListNode fastp = head;

        while(fastp.next != null) {
            if(slowp.next == null) {
                break;
            }

            else if(fastp.next.next == null) {
                slowp = slowp.next;
                break;
            }

            else {
                fastp = fastp.next.next;
                slowp = slowp.next;
            }
        }

        return slowp;
    }
}