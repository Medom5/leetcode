class Solution {
   public static void moveZeroes(int[] nums) {
        int zero_count = 0, index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0)
                nums[index++] = nums[i];
            else
                zero_count++;
        }
        while (zero_count-- > 0) {
            nums[index++] = 0;
        }
    }
}