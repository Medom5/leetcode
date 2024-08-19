class Solution {
 public int minSubArrayLen(int target, int[] nums) {
        int len = 0, len2 = 0, sum = 0, left = 0, right = 0;
        while (left < nums.length) {
            while (right < nums.length) {
                if (sum < target) {
                    sum += nums[right++];
                    len2++;
                } else
                    break;
            }
            if (len == 0 && sum >= target) {
                len = len2;
            } else if (len2 < len && sum >= target) {
                len = len2;
            }

            sum -= nums[left];
            len2--;
            left++;
        }
        return len;
    }
}