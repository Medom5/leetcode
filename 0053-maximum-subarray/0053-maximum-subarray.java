class Solution {
    public int maxSubArray(int[] nums) {
        int curSum = nums[0];
        int max = nums[0];

        for(int i=1; i<nums.length; i++){
            curSum = Math.max(nums[i], curSum+nums[i]);
            max = Math.max(curSum, max);
        }

        return max;
    }
}