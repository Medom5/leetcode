class KthLargest {
    private int k;
    PriorityQueue<Integer> minHeap;
    
    public KthLargest(int k, int[] nums) {
        this.k = k;
        
        minHeap = new PriorityQueue<>();
        
        for(int e : nums)
            add(e);
    }
    
    public int add(int val) {
        
        if(minHeap.size() < k) {
            minHeap.add(val);
        }
        else if (val > minHeap.peek()){
            minHeap.poll();
            minHeap.add(val);
        }
        
        return minHeap.peek(); 
    }
    
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */