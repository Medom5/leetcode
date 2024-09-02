class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        if(n*m != original.length)
            return new int[][]{};
        int[][] res= new int[m][n];
        int index=0;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                res[i][j]=original[index++];
            }
        }
    return res;
    }
}