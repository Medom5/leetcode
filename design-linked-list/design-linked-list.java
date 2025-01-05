 class Node {
    int val;
    Node next;
    
    public Node(){
        
    }
}

class MyLinkedList {
    private Node list; 
    private int size;
    public MyLinkedList() {
        list=null;
        size=0;
    }
    
    public int get(int index) {
        if(index<0 || index> size-1) 
            return -1;
        int i=index;
        Node cur=list;
        
        while(index-->0){
            cur=cur.next;
        }
        
        return cur.val;
        
    }
    
    public void addAtHead(int val) {
        if(size==0)
        {   list=new Node();
            list.val=val;
            list.next=null;
            size++;
        }
        else {
            Node head = new Node();
            head.val=val;
            head.next=list;
            list=head;
            size++;
        }
    }
    
    public void addAtTail(int val) {
        if(size==0){
            list=new Node();
            list.val=val;
            list.next=null;
        }else{
        Node cur = list;
        while(cur.next!=null){
            cur=cur.next;
        }
        Node tail = new Node();
        tail.val = val;
        cur.next=tail;
        tail.next=null;}
        size++;
    }
    
    public void addAtIndex(int index, int val) {
        if(index>size)
            return;
        else if(index==0)
            addAtHead(val);
        
        else{
        Node cur = list;
        int i=index;
        while(i-->1){
            cur=cur.next;
        }
        Node n = new Node();
        n.val=val;
        n.next=cur.next;
        cur.next=n;
        }
        size++;
        }
    
    public void deleteAtIndex(int index) {
        if( index < 0 || index > size-1)
            return;
        if(index==0){
            list=list.next;
            }else{
                Node cur = list;
                int i=index;
                while(cur!=null && i-->1){
                     cur=cur.next;
            }
            cur.next=cur.next.next;}
        size--;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */