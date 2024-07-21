class Solution {
         public static int thirdMax(int[] nums) {
        long max = Long.MIN_VALUE, max2 = Long.MIN_VALUE, max3 = Long.MIN_VALUE;
        for (int i : nums) {
            if (i > max) {
                max3 = max2;
                max2 = max;
                max = i;
            } else if (max > i && i > max2) {
                max3 = max2;
                max2 = i;
            } else if (max2 > i && i > max3) {
                max3 = i;
            }

        }

        if (max3 == Long.MIN_VALUE)
            return (int)max;
        else
            return (int)max3;
    }
}