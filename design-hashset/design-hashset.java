class MyHashSet {
    private HashSet<Integer> mySet = new HashSet<Integer>();

    public MyHashSet() {
    }

    public void add(int key) {
        mySet.add(key);
    }

    public void remove(int key) {
        mySet.remove(key);
    }

    public boolean contains(int key) {
        return mySet.contains(key);
    }
}
/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */