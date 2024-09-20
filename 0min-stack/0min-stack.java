class MinStack {
    private Node stack;
    private Node top;
    private Node prev;
    class Node {
        int data;
        int minVal;
        Node next;
        Node prev;
        
        Node(){
            
        }
        
        Node(int data, Node prev, Node next, int minVal){
            this.data = data;
            this.next = next;
            this.prev = prev;
            this.minVal = data > minVal ? minVal : data;
        }
        
    }

    public MinStack() {
        stack = null ;
        top = null;
    }
    
    public void push(int val) {
        if (top == null ) {
            stack = new Node(val,null,null, val);
            top = stack;
        }
        else {
            Node n = new Node(val,top, null , top.minVal);
            top.next = n;
            top = n;
        }
    }
    
    public void pop() {
          top = top.prev;
    }
    
    public int top() {
        return top.data;
    }
    
    public int getMin() {
        return top.minVal;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */