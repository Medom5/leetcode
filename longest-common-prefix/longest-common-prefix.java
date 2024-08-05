class Solution {
   public String longestCommonPrefix(String[] strs) {

        String shortest = strs[0];
        for (int i = 1; i < strs.length; i++) {
            if (shortest.equals(""))
                return "";

            if (shortest.length() > strs[i].length())
                shortest = strs[i];
        }

        boolean equal;
        int len = shortest.length();
        for (int i = 0; i < len; i++) {
            equal = true;
            for (String string : strs) {
                if (!string.substring(0, shortest.length()).equals(shortest)) {
                    equal = false;
                    break;
                }
            }
            if (equal) {
                return shortest;
            }

            shortest = shortest.substring(0, shortest.length() - 1);
        }

        return shortest;
    }
}