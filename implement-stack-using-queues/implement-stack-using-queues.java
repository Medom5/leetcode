class MyStack {
    private Queue<Integer> q;
    private List<Integer> temp;
    public MyStack() {
        q = new LinkedList<>();
        temp = new ArrayList<>();
    }
    
    public void push(int x) {
        while(!q.isEmpty())
            temp.add(q.poll());
        q.offer(x);
        for(int e : temp)
            q.offer(e);
        temp.clear();
    }
    
    public int pop() {
        return q.poll();
    }
    
    public int top() {
        return q.peek();
    }
    
    public boolean empty() {
        return q.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */