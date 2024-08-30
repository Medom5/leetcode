class Solution {
    public int singleNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int e : nums) {
            if (set.contains(e)) {
                set.remove(e);
            }
            else
            set.add(e);
        }
        return set.iterator().next();
    }
}