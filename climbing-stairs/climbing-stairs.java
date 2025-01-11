class Solution {
    public int climbStairs(int n) {
        return fibHelper(n, new HashMap<Integer, Integer>()) + fibHelper(n-1, new HashMap<Integer, Integer>());
    }
    private int fibHelper(int n, Map<Integer, Integer> cache){
        if(n <= 1)
            return n;
        if(cache.containsKey(n))
            return cache.get(n);
        
        int result = fibHelper(n-1,cache) + fibHelper(n-2, cache);
        
        cache.put(n, result);
        
        return result;
    }
}