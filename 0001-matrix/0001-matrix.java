class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int m = mat.length, n = mat[0].length;
        int[][] directions = new int[][]{{0,1}, {1,0}, {-1,0}, {0,-1}};
        Queue<int[]> q = new LinkedList<>();
        
        for(int i=0; i<m; i++)
            for(int j=0; j<n; j++)
                if(mat[i][j] == 0)
                    q.offer(new int[]{i,j});
                else 
                    mat[i][j] = -1;
        
        while(!q.isEmpty()){
            int[] d = q.poll();
            int x = d[0], y= d[1];
            
            for(int[] dir : directions){
                int nx= x + dir[0], ny = y + dir[1];
                if(nx >= 0 && nx < m && ny >= 0 && ny < n && mat[nx][ny] == -1){
                    mat[nx][ny] = mat[x][y]+1;
                    q.offer(new int[]{nx,ny});
                }
            }
        }
        return mat;
    }
}