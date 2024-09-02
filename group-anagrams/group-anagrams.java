
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length == 0) {
            return new ArrayList<List<String>>();
        }

        List<List<String>> anagrams = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);
            List<String> list = map.getOrDefault(sorted, new ArrayList<String>());

            list.add(str);
            map.put(sorted, list);
        }
        for (List<String> val : map.values()) {
            anagrams.add(val);
        }
        return anagrams;
    }
}