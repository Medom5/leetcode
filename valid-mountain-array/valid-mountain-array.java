class Solution {
   public static boolean validMountainArray(int[] arr) {

        if (arr.length <= 2) {
            return false;
        }

        boolean mountain = false;
        int counter = 0;
        for (int i = 1; i < arr.length; i++) {

            if (arr[i] < arr[i - 1]) {
                counter++;
            }

            if (arr[i] == arr[i - 1]) {
                return false;
            }

            if (arr[i] < arr[i - 1]) {

                mountain = true;
            }

            if (mountain && arr[i] > arr[i - 1]) {
                return false;
            }

        }

        return counter == (arr.length - 1) ? false : mountain;

    }

}