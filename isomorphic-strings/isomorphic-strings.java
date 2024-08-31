
class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> strS = new HashMap<>();
        HashMap<Character, Character> strT = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if (strS.containsKey(s.charAt(i)) && strS.get(s.charAt(i)) != t.charAt(i) || strT.containsKey(t.charAt(i)) && strT.get(t.charAt(i)) != s.charAt(i) ) {
                return false;
            }

             strS.put(s.charAt(i), t.charAt(i));
                strT.put(t.charAt(i), s.charAt(i));
        }
        return true;
    }
}