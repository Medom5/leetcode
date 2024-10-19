class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        Set<Integer> s = new HashSet<>(); 
        Queue<Integer> q = new LinkedList<>();

        q.offer(0);
        s.add(0);

        while(!q.isEmpty()){
        
            List<Integer> room = rooms.get(q.poll());
           
                for(Integer e : room){
                     if(s.add(e))
                         q.add(e);
                }
        }

        return s.size() == rooms.size();
    }
}