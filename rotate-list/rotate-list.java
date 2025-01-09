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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null)
            return head;
        int len=0;
        ListNode cur = head;
        ListNode tail=head;
        while(cur != null){
            len++;
            tail=cur;
            cur=cur.next;

        }
        
        k%=len;
        k=len - k;
        cur=head;
        if(k==0)
            return head;
     
        while(k-->1)
            cur=cur.next;
        
        tail.next=head;        
        head=cur.next;
        cur.next=null;
        
        return head;
    }
}