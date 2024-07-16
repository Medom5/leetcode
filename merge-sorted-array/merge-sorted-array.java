class Solution {
   public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] arr = nums1.clone();
        int i, j, k;
        for (i = 0, j = 0, k = 0; k < arr.length - m; k++) {
            if (!(m > 0 && n > 0))
                break;
            if (arr[i] < nums2[j]) {
                nums1[k] = arr[i];
                i++;
                m--;
            } else {
                nums1[k] = nums2[j];
                j++;
                n--;
            }
        }
        
        while (m-- > 0) {
            nums1[k++] = arr[i++];
        }
        while (n-- > 0) {
            nums1[k++] = nums2[j++];
        }
    }
}