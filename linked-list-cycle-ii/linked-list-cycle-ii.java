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
    public ListNode detectCycle(ListNode head) {
          if(head== null || head.next == null)
            return null;
        
        ListNode slow=head;
        ListNode fast=head;
        
        while(true){
            if (fast == null || fast.next == null)
                return null;
            fast=fast.next.next;
            slow=slow.next;
             if(fast==slow)
                break;
        }
        
        slow=head;
        while(slow!=fast){
            fast=fast.next;
            slow=slow.next;
        }
        return slow;
    }
}