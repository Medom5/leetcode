class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int e : nums) {
            if (set.contains(e)) {
                return true;
            }
            set.add(e);
        }
        return false;
    }
}
