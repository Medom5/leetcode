class Solution {
    public boolean isValid(String str) {
        char[] arr = str.toCharArray();
        Stack<Character> s = new Stack<>();
        
        for(char ch : arr){
            char p = '1';
            if(!s.isEmpty())
                 p = s.peek();
            if(ch == ')' && p == '(' || ch == '}' && p == '{' || ch == ']' && p == '[')
                s.pop();
            else s.push(ch);
        }
        
        return s.isEmpty();
    }
}