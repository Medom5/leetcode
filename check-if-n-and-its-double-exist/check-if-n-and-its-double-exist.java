class Solution {
   public static boolean checkIfExist(int[] arr) {
        int zeros = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], arr[i]);
            if (arr[i] == 0) {
                zeros++;
            }
        }
        if (zeros >= 2) {
            return true;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0 && map.getOrDefault(arr[i] + arr[i], -99999) != -99999)
                return true;
        }

        return false;
    }
}