class Solution {
    public int[] dailyTemperatures(int[] temps) {
        Stack<Integer> s = new Stack<>();
        int[] res = new int[temps.length];
        
       for(int i = temps.length - 1; i >=0; i--){
           while(!s.isEmpty() && temps[i] >= temps[s.peek()]){
               s.pop();
           }
           
           if(!s.isEmpty())
                res[i]= s.peek() - i;
           s.push(i);
       }
    return res;
    }
}