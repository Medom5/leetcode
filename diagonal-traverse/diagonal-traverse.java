class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
 int i = 0, j = 0;
        int total = mat[0].length * mat.length;

        boolean up = true;
        int[] arr = new int[total];

        for (int k = 0; k < total; k++) {
            arr[k] = mat[i][j];
            if (up) {
                if (i == 0 && j < mat[i].length - 1) {
                    j += 1;
                    up = false;
                } else if (i == 0 && j == mat[i].length - 1) {
                    i += 1;
                    up = false;
                } else if (j == mat[i].length - 1) {
                    i += 1;
                    up = false;
                } else {
                    i -= 1;
                    j += 1;
                }
            } else {
                if (j == 0 && i < mat.length - 1) {
                    i += 1;
                    up = true;
                } else if (i == mat.length - 1) {
                    j += 1;
                    up = true;
                } else {
                    i += 1;
                    j -= 1;
                }

            }
        }
        return arr;
    }
}