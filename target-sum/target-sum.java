class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        return nums.length == 1 && nums[0] == target ? 1 : findH(nums,target, new HashMap<String, Integer>(), 0 , 0);
    }
    public int findH(int[] nums, int target, Map<String, Integer> map , int sum, int index){
        if(index == nums.length)
            return sum == target ? 1: 0;
        
        String s = index + "$" + sum;
        
        if(map.containsKey(s))
            return map.get(s);
        
        int ways = findH(nums, target, map, sum + nums[index], index+1)
                    + findH(nums, target, map, sum - nums[index], index+1);
        map.put(s, ways);
        
        return ways;
       
        }
    }