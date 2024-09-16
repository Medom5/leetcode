class Solution {
    public int numIslands(char[][] grid) {
        int islands = 0;
        int m = grid.length;
        int n = grid[0].length;
        
        for(int i=0; i<m; i++){
            for(int j=0; j< n;j++){
                if(grid[i][j] == '1'){
                    BFS(grid, i, j);
                    islands++;
                }
            }
        }
        return islands;
    }
    
    public void BFS(char[][] grid, int i, int j){
        
        int[][] directions = {{0,1}, {1,0}, {0,-1}, {-1,0}};
        Queue<int[]> q = new LinkedList<>();
        
        q.offer(new int[]{i, j});
        grid[i][j] = 0;
        
        while(!q.isEmpty()){
            int[] curr = q.poll();
            int x = curr[0];
            int y = curr[1];
            
                    for(int[] a : directions){
                        int n=x+ a[0];
                        int m=y+ a[1];
                            if(n>=0 && n< grid.length && m >= 0 && m < grid[0].length && grid[n][m] == '1')
                               { q.offer(new int[]{n, m});
                                grid[n][m] = '0';}
                        }
                    }
                
            
    }
}