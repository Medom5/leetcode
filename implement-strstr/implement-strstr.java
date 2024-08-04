class Solution {
    public int strStr(String haystack, String needle) {
        if(haystack.equals(needle))
            return 0;
        
        int size = needle.length();
        for(int i = 0 ; i<= haystack.length( ) - size; i++){
            
            if(haystack.charAt(i) == needle.charAt(0) 
               && needle.equals(haystack.substring(i, i+size)))
                return i;
        }
        return -1;
    }
}