class Solution {
    public int lengthOfLastWord(String s) {
       int c=0, i=s.length()-1;

       while(s.charAt(i) == ' ')
            i--;

        if(i==0) return 1;

        while(i >=0 && s.charAt(i) != ' '){
            i--;
            c++;
        }
        return c;        
        
    }
}