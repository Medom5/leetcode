class Solution {
    public int averageValue(int[] nums) {
        int avg = 0;
        int c = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 6 == 0) {
                avg += nums[i];
                c++;
            }
        }
        return c == 0? 0: avg / c;
    }
}