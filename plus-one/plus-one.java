class Solution {
 public static int[] plusOne(int[] digits) {

        int carry = 0;
        digits[digits.length - 1]++;
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i] += carry;
            if (digits[i] >= 10) {
                carry = 1;
                digits[i] = 0;
            } else
                carry = 0;

        }
        if (carry == 1 ) {
            int[] arr = new int[digits.length + 1];
            System.arraycopy(digits, 0, arr, 1, digits.length - 1);
            arr[0] = 1;
            return arr;

        }
        return digits;

    }

}