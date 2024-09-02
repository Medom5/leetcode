class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        if (nums1.length < nums2.length) {
            int[] temp = nums1;
            nums1 = nums2;
            nums2 = temp;
        }
        HashMap<Integer, Integer> map1 = new HashMap<>();
        HashMap<Integer, Integer> map2 = new HashMap<>();
        int index = 0;
        for (int i = 0; i < nums1.length; i++) {
            map1.put(nums1[i], map1.getOrDefault(nums1[i], 0) + 1);
        }
        for (int i = 0; i < nums2.length; i++) {
            map2.put(nums2[i], map2.getOrDefault(nums2[i], 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : map2.entrySet()) {
            int key = entry.getKey();
            int val1 = entry.getValue();
            if (map1.containsKey(key)) {
                int val2 = map1.get(key);
                int min = val2 > val1 ? val1 : val2;
                while (min-- > 0) {
                    nums1[index++] = key;
                }
            }
        }

        return Arrays.copyOfRange(nums1, 0, index);
    }
}