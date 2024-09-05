class Solution {
    public int lengthOfLongestSubstring(String s) {

        int len = 0;
        int left = 0, right = 0;
        Set<Character> set = new HashSet<>();

        while( right < s.length()){
            while(set.contains(s.charAt(right))){
                set.remove(s.charAt(left++));
                
            }
            set.add(s.charAt(right));
            len = set.size() > len ? set.size() : len;                         
            right++;   
           

        }
        return len;
    }
}