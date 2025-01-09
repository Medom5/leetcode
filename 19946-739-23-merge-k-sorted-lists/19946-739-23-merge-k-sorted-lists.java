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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists == null || lists.length == 0)
            return null;
        if(lists.length == 1)
            return lists[0];
        if(lists.length == 2)
            return merge(lists[0], lists[1]);

        return mergekLists(lists, 0, lists.length-1); 
    }

    private ListNode mergekLists(ListNode[] lists, int start, int end){
        if(start == end)
            return lists[start];

        int mid = start + (end - start) / 2;
        ListNode left = mergekLists(lists,start,mid);
        ListNode right = mergekLists(lists,mid+1,end);

        return merge(left,right);
    }

    private ListNode merge(ListNode l1, ListNode l2){
        ListNode dummy = new ListNode(-1);
        ListNode cur = dummy;

        while(l1 != null && l2 != null){
            if(l1.val > l2.val) {
                cur.next = l2;
                l2 = l2.next;
            }
            else {
                cur.next = l1;
                l1=l1.next;
            }
            cur=cur.next;
        }
        cur.next= l1 != null ? l1 : l2;
        return dummy.next;
    }
}