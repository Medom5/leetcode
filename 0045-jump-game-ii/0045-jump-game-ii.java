class Solution {
    public int jump(int[] nums) {
        int goal = nums.length - 1;
        int jumps = 0;
        
        for(int i = nums.length - 2; i>=0; i--){
            for(int j = i; j>=0; j--){
                if(nums[j] + j >= goal)
                    i = j;
            }
            goal = i;
            jumps++;
        }
        return jumps;
    }
}