class Solution {
    public int[] sortedSquares(int[] nums) {
         int len = nums.length;
        int [] squared= new int[len];
        int i = 0;
        int j = len - 1;

        for (int k = len - 1; k >= 0; k--) {
            if (nums[j] * nums[j] > nums[i] * nums[i]) {
                squared[k] = nums[j] * nums[j];
                j--;
            }
            else {
                squared[k] = nums[i] * nums[i];
                i++;
            }
        }
       
       return squared;
    }
}