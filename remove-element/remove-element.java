class Solution {
public static int removeElement(int[] nums, int val) {
        int counter = 0;
        for (int i = 0, j = 0; i < nums.length; i++) {
            if (nums[i] == val)
                counter++;
            else
                nums[j++] = nums[i];
        }
        
       
        return nums.length-counter;
    }
}