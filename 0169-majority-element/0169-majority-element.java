class Solution {
    public int majorityElement(int[] nums) {
        int c = 0;
        int e = nums[0];
        
        for(int v : nums){
            if(e== v) 
                c++;
            else 
                c--;
            if(c==0)
            {
                c=1;
                e=v;
            }
        }
        return e;
    }
}