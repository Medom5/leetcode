
class Solution {
    public class Tracker {
        protected String lock;
        protected int steps;
        
        protected Tracker(String s, int p){
            lock=s;
            steps=p;
        }
    }
    public List<String> combinations(String str){
        List<String> list = new ArrayList<>();
        for(int i=0; i < 4; i++){
            char ch = str.charAt(i);
            list.add(str.substring(0,i) + ((ch - '0' + 1 )  %10) 
                    + str.substring(i+1));
            list.add(str.substring(0,i) + (((ch -'0' - 1) + 10) % 10 )
                    + str.substring(i+1));
        }
        return list;
    }
    public int openLock(String[] deadends, String target) {
        Set<String> set = new HashSet<>();
        for(String str : deadends){
            if(str.equals("0000"))
                return -1;
            set.add(str);    
        }
        Queue<Tracker> q = new LinkedList<>();
        
        
        q.offer(new Tracker("0000", 0));
        
        while(!q.isEmpty()){
            Tracker trk = q.poll();
            
            if(trk.lock.equals(target))
                return trk.steps;
            
            for(String str : combinations(trk.lock)){
                if(!set.contains(str)){
                    set.add(str);
                    q.offer(new Tracker(str, trk.steps +1));
                }
            }
        }
        return -1;
    }
}