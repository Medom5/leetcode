/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head == null)
            return null;
        Node cur = head;
        while(cur != null){
            Node n = new Node(cur.val);
            n.next=cur.next;
            cur.next=n;
            cur=n.next;
        }
        cur=head;
        while(cur != null){
            cur.next.random= cur.random != null ? cur.random.next : null;
            cur=cur.next.next;
        }
        
        cur=head;
        Node list = head.next;
        Node curList = list;
        while(cur != null){
            cur.next=cur.next.next;
            curList.next = curList.next != null ? curList.next.next : null;
            
            cur=cur.next;
            curList=curList.next;
           
        }
        return list;
    }
}