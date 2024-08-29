class Solution {
   public void reverseWord(char[] arr, String s, int i, int j, int c) {
    if (i > j)
      return;

    arr[c] = s.charAt(j);

    reverseWord(arr, s, i, j - 1, c + 1);
  }

  public String reverseWords(String s) {
    int i, j;
    char[] arr = new char[s.length()];
    // loop over the array and reverse each word
    for (i = 0, j = 0; j <= s.length(); j++) {
      if (j == s.length() || s.charAt(j) == ' ') {
        reverseWord(arr, s, i, j - 1,i);
        i = j + 1;
        if (j != s.length()) {
          arr[j] = ' ';
        }
      }
    }

    return new String(arr);
  }
}