class Solution {
    public int longestConsecutive(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int max = 0;
        for(int e: nums) {
            if(!map.containsKey(e)) {
                int left = map.getOrDefault(e-1, 0);
                int right = map.getOrDefault(e+1, 0);

                int length = left + right + 1;

                max = Math.max(max, length);

                map.put(e, length);
                map.put(e - left, length);
                map.put(e + right, length);
            }

                }        return max;
    }
}
