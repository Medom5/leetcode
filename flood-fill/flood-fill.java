class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        Set<String> visited = new HashSet<>();
        int[][] directions = {{0,1}, {1,0}, {0,-1}, {-1,0}};
        Queue<int[]> q = new LinkedList<>();
        int c = image[sr][sc];
        
        q.offer(new int[]{sr, sc});
        visited.add(sr+""+sc);
        image[sr][sc] = color;
        while(!q.isEmpty()){
            int[] arr = q.poll();
            sr = arr[0]; 
            sc = arr[1];
            for(int[] a : directions){
                        int n=sr+ a[0];
                        int m=sc+ a[1];
                String str = n + "" + m;
                            if(!visited.contains(str) && n>=0 && n< image.length && m >= 0 
                               && m < image[0].length && image[n][m] == c){
                                q.offer(new int[]{n,m});
                                image[n][m] = color;
                                visited.add(str);
                            }
            }
            
        }
        return image;
    }
}