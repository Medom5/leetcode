class Solution {
        public String addBinary(String a, String b) {
        if (a.equals("0") && b.equals("0")) {
            return a;
        }
        if(a.equals("0"))
            return b;
        if(b.equals("0"))
            return a;
        int lenA = a.length(), lenB = b.length();
        String str = "";
        if (lenA < lenB) {
            int tempLen = lenB;
            lenB = lenA;
            lenA = tempLen;

            String temp = a;
            a = b;
            b = temp;

        }

        int i = lenA - 1, j = lenB - 1, carry = 0, sum = 0;
        while (i >= 0 && j >= 0) {
            sum = Character.getNumericValue(a.charAt(i--))
                    + Character.getNumericValue(b.charAt(j--)) + carry;

            if (sum == 0)
                str = '0' + str;
            else if (sum == 1) {
                str = '1' + str;
                carry = 0;
            } else if (sum == 2) {
                str = '0' + str;
                carry = 1;
            } else {
                str = '1' + str;
                carry = 1;
            }
        }

        while (i >= 0) {
            sum = Character.getNumericValue(a.charAt(i)) + carry;

            if (sum == 0)
                str = '0' + str;
            else if (sum == 1) {
                str = '1' + str;
                carry = 0;
            } else if (sum == 2) {
                str = '0' + str;
                carry = 1;
            } else {
                str = '1' + str;
                carry = 1;
            }
            i--;
        }
        
        return carry == 1 ? '1' + str : str;
    }
}