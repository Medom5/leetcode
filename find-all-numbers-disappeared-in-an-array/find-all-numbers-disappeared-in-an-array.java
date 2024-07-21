class Solution {
     public static List<Integer> findDisappearedNumbers(int[] nums) {
        HashSet<Integer> Disappeared = new HashSet<>();
        for (int i : nums) {
            Disappeared.add(i);
        }

        int j = 0;
        for (int i = 1; i <= nums.length; i++) {
            if (!Disappeared.contains(i)) {
                nums[j++] = i;

            }
        }
        Disappeared.clear();

        for (int i = 0; i < j; i++) {
            Disappeared.add(nums[i]);
        }

        return new ArrayList<>(Disappeared);

    }
}