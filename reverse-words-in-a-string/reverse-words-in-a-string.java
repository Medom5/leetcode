
class Solution {
  public void reverseWord(ArrayList<Character> arr, int i, int j) {
    if (i >= j) {
      return;
    }

    char temp = arr.get(i);
    arr.set(i, arr.get(j));
    arr.set(j, temp);

    reverseWord(arr, i + 1, j - 1);
  }

  public String reverseWords(String s) {
    s = s.trim();

    int i, j;

    ArrayList<Character> arr = new ArrayList<>();

    // reverse string and remove duplicate spaces between words
    for (i = s.length() - 1; i >= 0; i--) {
      if (i != s.length() - 1 && s.charAt(i) == ' ' && s.charAt(i + 1) != ' ') {
        arr.add(' ');
      } else if (s.charAt(i) != ' ') {
        arr.add(s.charAt(i));

      }
    }
    // loop over the array and reverse each word
    for (i = 0, j = 0; j <= arr.size(); j++) {
      if (j == arr.size() || arr.get(j) == ' ') {

        reverseWord(arr, i, j - 1);
        i = j + 1;
      }
    }

    char[] str = new char[arr.size()];
    for (i = 0; i < arr.size(); i++)
      str[i] = arr.get(i);

    return new String(str);
  }
}
