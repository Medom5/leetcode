class Solution {
    public int lengthOfLongestSubstring(String s) {

        int len = 0;
        int left = 0, right = 0;
        Set<Character> set = new HashSet<>();

        while( right < s.length()){
            boolean bool = set.add(s.charAt(right));
            len = set.size() > len ? set.size() : len;
            if(!bool){
                
                set.clear();
                left++;
                right=left;
                set.add(s.charAt(right));

            }                         
            right++;   
           

        }
        return len;
    }
}