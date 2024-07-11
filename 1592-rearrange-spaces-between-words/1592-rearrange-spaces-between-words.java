
class Solution {
    public String reorderSpaces(String text) {
      int c = 0, spacesCount, words = 0;
        String temp = text.trim(), newStr = "", spaces = "";

        for (int i = 1; i < temp.length(); i++) {
            if (temp.charAt(i) != ' ' && temp.charAt(i - 1) == ' ') {
                words++;
            }
        }
        if (temp.charAt(temp.length() - 1) != ' ') {
            words++;
        }
        for (char ch : text.toCharArray())
            if (ch == ' ')
                c++;

        if(words-1 == 0) {
        newStr=text.trim();
        for(char ch : text.toCharArray())
        {if(ch == ' ')
                newStr+=ch;
            
        }
            return newStr;
        }
        spacesCount = c / (words - 1);

        while (spacesCount-- != 0)
            spaces += ' ';

        for (int i = 0; i < temp.length() - 1; i++) {
            if (temp.charAt(i) != ' ')
                newStr += temp.charAt(i);
            else if (temp.charAt(i) == ' ' && temp.charAt(i + 1) != ' ') 
            newStr += spaces;

        }
        newStr += temp.charAt(temp.length() - 1);
        for (char ch : newStr.toCharArray()) {
            if (ch == ' ')
                c--;
        }
        
        String remaining ="";
        while (c-- != 0) {
            remaining += ' ';
        }
        newStr += remaining;

        return newStr;
    }
}