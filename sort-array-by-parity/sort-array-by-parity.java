class Solution {
    public static int[] sortArrayByParity(int[] nums) {
        int len = nums.length;
        for (int i = 0, j = len - 1; i <= j;) {
            if (nums[i] % 2 == 1) {
                if (nums[j] % 2 == 0) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                    j--;
                    i++;
                } else
                    j--;

            } else
                i++;
        }

        return nums;
    }
}