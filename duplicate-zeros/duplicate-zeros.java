class Solution {
    public static void duplicateZeros(int[] arr) {
        
        
            int[] copy = arr.clone();
            int j = 0, i;
            for (i = 0; i < arr.length - 1; i++, j++) {

                arr[i] = copy[j];
                if (arr[i] == 0) {
                    arr[i + 1] = 0;
                    i++;

                }

            }
            if (i == arr.length-1) {
                arr[i] = copy[j];
            }
            
        }
}