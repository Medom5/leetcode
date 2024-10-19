class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int s = rooms.size();
        boolean[] visited = new boolean[s];
        Queue<Integer> q = new LinkedList<>();

        q.offer(0);
        visited[0] = true;
        
        int c = 1;
        while(!q.isEmpty()){
            List<Integer> room = rooms.get(q.poll());
            
                for(Integer e : room){
                     if(!visited[e]){
                         q.add(e);
                         visited[e] = true;
                         c++;
                     }
                }
        }

        return c == s;
    }
}