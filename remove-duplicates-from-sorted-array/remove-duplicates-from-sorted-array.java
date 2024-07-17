class Solution {
    public int removeDuplicates(int[] nums) {
        int index = 0;
        boolean yes = true;

        for (int i = 0; i < nums.length - 1; i++) {

            if (yes) {
                nums[index++] = nums[i];
            }
            if (nums[i] == nums[i + 1]) {
                yes = false;
            } else
                yes = true;

        }

        if (yes) {
            nums[index++] = nums[nums.length - 1];
        }

        return index;
    }
}