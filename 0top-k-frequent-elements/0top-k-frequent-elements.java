class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> arr = new ArrayList<>();
        
        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }
        
        List<List<Integer>> list = new ArrayList<>();
        int len = nums.length + 1;
        for (int i=0; i < len; i++){
            list.add(new ArrayList<Integer>());
        }
       
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            list.get(entry.getValue()).add(entry.getKey());
        }
        int index=list.size() - 1;
        
        for(int i=index; i >= 0; i--){ 
            List<Integer> l = list.get(i);
            if(!l.isEmpty())
                for(int j=0; j < list.get(i).size() && k-- > 0; j++){
                    arr.add(l.get(j));
                } 
        }
        
        int[] res = new int[arr.size()];
        index=0;
        for(Integer e : arr)
            res[index++]=e;
        
        return res;
    }
}