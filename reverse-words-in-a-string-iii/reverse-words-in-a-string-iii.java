class Solution {
 public void reverseWord(char[] arr, int i, int j) {
    if (i >= j)
      return;

    char temp;
    temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;

    reverseWord(arr, i + 1, j - 1);
  }

  public String reverseWords(String s) {
    int i, j;
    char[] arr = s.toCharArray();
    // loop over the array and reverse each word
    for (i = 0, j = 0; j <= s.length(); j++) {
      if (j == s.length() || s.charAt(j) == ' ') {
        reverseWord(arr, i, j - 1);
        i = j + 1;
        if (j != s.length()) {
          arr[j] = ' ';
        }
      }
    }

    return new String(arr);
  }
}