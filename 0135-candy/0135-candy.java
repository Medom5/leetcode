class Solution {
    public int candy(int[] ratings) {
        int[] res = new int[ratings.length];
        int sum = 0;
        
        res[0] = 1;
        for(int i=1; i<ratings.length; i++){
            if(ratings[i] <= ratings[i-1])
                res[i] = 1;
            else res[i] = res[i-1]+1;
        }
        
        for(int i= ratings.length-2; i>=0; i--){
            if(ratings[i] > ratings[i+1])
                res[i] = Math.max(res[i], res[i+1]+1);
        }
        
        for(int e : res)
            sum+=e;
        return sum;
    }
}