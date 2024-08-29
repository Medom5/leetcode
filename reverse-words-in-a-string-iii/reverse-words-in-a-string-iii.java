class Solution {
   public void reverseWord(ArrayList<Character> arr, String s, int i, int j) {
    if (i > j) {
      return;
    }
    arr.add(s.charAt(j));

    reverseWord(arr, s, i, j - 1);
  }

  public String reverseWords(String s) {
    int i, j;
    ArrayList<Character> arr = new ArrayList<>();
    // loop over the array and reverse each word
    for (i = 0, j = 0; j <= s.length(); j++) {
      if (j == s.length() || s.charAt(j) == ' ') {
        reverseWord(arr, s, i, j - 1);
        i = j + 1;
        if (j != s.length()) {
          arr.add(' ');
        }
      }
    }
    char[] str = new char[arr.size()];
    for (i = 0; i < arr.size(); i++)
      str[i] = arr.get(i);

    return new String(str);
  }
}