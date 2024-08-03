class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
          int width = matrix[0].length, height = matrix.length, total = width * height,
                left = 0, right = width - 1, top = 0, bottom = height - 1, i = 0, j = 0, k = 0;

        List<Integer> arr = new ArrayList<>(total);

        int turn = 0; // 0-> horizontal to right , 1-> vertical to bottom ,
                      // 2-> horizontal to left , 3-> vertical to top
        while (k < total) {
            if (turn % 4 == 0) {
                for (j = left; j <= right; j++, k++) {
                    arr.add(matrix[i][j]);
                }
                j--;
                top++;
            } else if (turn % 4 == 1) {
                for (i = top; i <= bottom; i++, k++) {
                    arr.add(matrix[i][j]);
                }
                i--;
                right--;
            } else if (turn % 4 == 2) {
                for (j = right; j >= left; j--, k++) {
                    arr.add(matrix[i][j]);
                }
                j++;
                bottom--;
            } else {
                for (i = bottom; i >= top; i--, k++) {
                    arr.add(matrix[i][j]);
                }
                i++;
                left++;
            }
            turn++;
        }

        return arr;
    }
}