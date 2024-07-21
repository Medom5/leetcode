class Solution {
   public static List<Integer> findDisappearedNumbers(int[] nums) {
        HashSet<Integer> Disappeared = new HashSet();
        for (int i = 1; i <= nums.length; i++) {
            Disappeared.add(i);
        }

        for (int i : nums) {
            Disappeared.remove(i);
        }

        return new ArrayList(Disappeared);

    }
}