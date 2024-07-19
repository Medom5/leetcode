class Solution {
    public int heightChecker(int[] arr) {
        int[] expected = arr.clone();
        Arrays.sort(expected);
        int c = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != expected[i])
                c++;
        }
        return c;
    }
}