class Solution {
   public int[] intersection(int[] nums1, int[] nums2) {
    HashSet<Integer> intersection = new HashSet<>();
    for (int num : nums1) {
      intersection.add(num);
    }
    int index = 0;
    int[] arr= nums2.length > nums1.length ? new int[nums1.length]: new int [nums2.length]; 
    for (int e : nums2) {
      if (intersection.contains(e)) {
        arr[index++] = e;
          intersection.remove(e);
          
      }
    }
    return index > 0 ? Arrays.copyOfRange(arr, 0, index ) : new int[0];
  }
}