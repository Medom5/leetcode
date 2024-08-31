class Solution {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> numbers = new HashMap<>();
        int n;
        
        for (int i = 0; i < nums.length; i++) {
            n = target - nums[i];
            if (numbers.containsKey(n)) {
                return new int[] { numbers.get(n), i};
            }
            numbers.put(nums[i],i);
        }

        return new int[] {};
    }
}