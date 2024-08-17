class Solution {
    public int[] twoSum(int[] nums, int target) {
        
    int i=0, j=nums.length-1;
    while(true){
        if(nums[i]+nums[j]== target)
            return new int[]{i+1,j+1};
            
        if(nums[i]<=nums[j] && nums[i]+nums[j]<target)
            i++;
        else 
            j--;
    
        }
    }
}