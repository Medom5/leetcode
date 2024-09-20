class Solution {
    public int[] dailyTemperatures(int[] temps) {
        Stack<Integer> s = new Stack<>();
        int[] res = new int[temps.length];
        int Index = temps.length -1 ;
        
       for(int i = temps.length - 1; i >=0; i--){
           while(!s.isEmpty() && temps[i] >= temps[s.peek()]){
               s.pop();
           }
           
           if(s.isEmpty())
               res[Index--] = 0;
           else 
                res[Index--]= s.peek() - i;
           s.push(i);
       }
    return res;
    }
}