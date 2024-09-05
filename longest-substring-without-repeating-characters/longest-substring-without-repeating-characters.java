class Solution {
    public int lengthOfLongestSubstring(String s) {

        int len = 0;
        int left = 0, right = 0;
        Set<Character> set = new HashSet<>();
        char[] arr = s.toCharArray();
        while( right < arr.length){
            while(set.contains(arr[right]))
                set.remove(arr[left++]);
            
            set.add(arr[right]);
            len = right - left + 1 > len ? right - left + 1 : len;                         
            right++;
        }
        
        return len;
    }
}