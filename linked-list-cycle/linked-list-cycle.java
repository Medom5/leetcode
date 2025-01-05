/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head== null || head.next == null)
            return false;
        
        ListNode slow=head;
        ListNode fast=head;
        
        while(true){
            if(fast == null || fast.next == null)
                return false;
            fast=fast.next.next;
            if(fast==slow)
                return true;
            slow=slow.next;
        }
    }
}