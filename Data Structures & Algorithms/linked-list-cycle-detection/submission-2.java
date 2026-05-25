/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode f = head;
        ListNode s = head;

        if(head==null){
            return false;
        }

        while(s.next!=null && s.next.next!=null){
            f=f.next;
            s=s.next.next;
            if(s==f)
            return true;
        }
        return false;
    }
}
