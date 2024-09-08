class RandomizedSet {
    private Map<Integer, Integer> map;
    private List<Integer> arr;
    private Random random;
    
    public RandomizedSet() {
        map = new HashMap<>();
        arr = new ArrayList<>();
        random = new Random();
    }
    
    public boolean insert(int val) {
        if(!map.containsKey(val)){
            map.put(val,arr.size());
            arr.add(val);
            return true;
        }
        return false;
    }
    
    public boolean remove(int val) {
        if(!map.containsKey(val))
            return false;
        
        int index = map.get(val);
        int last = arr.get(arr.size()-1);

        map.put(last, index);
        arr.set(index, arr.get(arr.size()-1));
        arr.remove(arr.size()-1);
        map.remove(val);
        
        return true;
    }
    
    public int getRandom() {
        int ran = random.nextInt(arr.size());
        return arr.get(ran);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */