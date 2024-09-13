class MyCircularQueue  {
    private int[] queue;
    private int head , tail , size;   
    public MyCircularQueue(int k) {
        queue = new int[k];
        head = 0;
        tail = -1;
        size = 0;
    }
    
    public boolean enQueue(int value) {
        
        if(!isFull()){
            tail = (tail+1) % queue.length;
            queue[tail] = value;
            size++;
            return true;
        }
        return false;    
    }
    
    public boolean deQueue() {
       if(!isEmpty()){
           head = (head+1) % queue.length;
           size--;
           return true;
       }
        return false;
    }
    
    public int Front() {
        if(!isEmpty())
            return queue[head];
        return -1;
    }
    
    public int Rear() {
        if(!isEmpty())
            return queue[tail];
        return -1;
    }
    
    public boolean isEmpty() {
       return size == 0;
    }
    
    public boolean isFull() {
        return size == queue.length;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */