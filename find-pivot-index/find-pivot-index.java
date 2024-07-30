class Solution {
    public int pivotIndex(int[] nums) {
       
        int sum = 0, prefix = 0;
        for (int i : nums) {
            sum += i;
        }
        for (int i = 0; i < nums.length; i++) {
            if (sum - prefix == prefix + nums[i]) {
                return i;
            }
            prefix += nums[i];
        }

        if (sum - nums[0] == 0) {
            return 0;
        }

        if (sum - nums[nums.length - 1] == 0) {
            return nums.length - 1;
        }

        return -1;
    
    }
}