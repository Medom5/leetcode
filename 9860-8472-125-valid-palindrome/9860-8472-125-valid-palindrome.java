class Solution {
    public boolean isPalindrome(String s) {
       int left =0 , right=s.length()-1;
       s=s.toLowerCase();
        while(left<right){
         char l=s.charAt(left);
         char r=s.charAt(right);
         boolean lBool= Character.isLetter(l) || Character.isDigit(l);
         boolean rBool= Character.isLetter(r) || Character.isDigit(r);
        if(lBool == false)
             left++;
        if(rBool == false)
            right--;
        if(rBool && lBool)
            if(l==r){
                left++;
                right--;
            }
            else return false;
        }
       return true; 
    }
}