class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        int min = 3333;
        List<String> arr= new ArrayList<>();
        HashMap<String, Integer> l1 = new HashMap<>();

        for (int i = 0; i < list1.length; i++) {
            l1.put(list1[i], i);
        }
        for (int i = 0; i < list2.length; i++) {
            String s2=list2[i];
            if (l1.containsKey(s2)) {
                int sum=l1.get(s2) + i;
                if (sum < min) {
                    min= sum;
                    arr.clear();
                    arr.add(s2);
                } else if (sum  == min) {
                    arr.add(s2);
                }
            }
        }
        return arr.toArray(new String[arr.size()]);
    }
}