/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode a = headA;
        ListNode b = headB;
        int lenA = 0, lenB=0;

        while(a!=null ||  b!=null){
            if(a!=null)
            {    lenA++;
                a=a.next;
            }
            if(b!=null){
                lenB++;
                b=b.next;
                }
            
        }   
        a=headA;
        b=headB; 
        while(lenA>lenB)
            {a=a.next;
            lenA--;}    
        while(lenB>lenA){
            b=b.next;
            lenB--;
        }
        while(a!=b){
            a=a.next;
            b=b.next;
        }

        return a;
    }
}