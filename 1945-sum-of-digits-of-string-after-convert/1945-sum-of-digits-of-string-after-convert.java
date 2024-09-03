class Solution {
    public int getLucky(String s, int k) {
        int num = 0;
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            str.append(s.charAt(i) - 'a' + 1);
        }

        while (k-- > 0) {
            num = 0;

            for (int i = 0; i < str.length(); i++) {
                num += str.charAt(i) - '0';
            }
            str.setLength(0);
            str.append(num);
        }
        return num;
    }
}