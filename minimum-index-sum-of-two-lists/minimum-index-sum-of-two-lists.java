class Solution {
     public String[] findRestaurant(String[] list1, String[] list2) {
        int index = 0, sum = 3333;
        String[] res = list1.length > list2.length ? 
            new String[list2.length] : new  String[list1.length];
        HashMap<String, Integer> l1 = new HashMap<>();
        HashMap<String, Integer> l2 = new HashMap<>();

        for (int i = 0; i < list1.length; i++) {
            l1.put(list1[i], i);
        }
        for (int i = 0; i < list2.length; i++) {
            l2.put(list2[i], i);
        }

        for (Map.Entry<String, Integer> entry : l1.entrySet()) {
            if (l2.containsKey(entry.getKey())) {
                if (entry.getValue() + l2.get(entry.getKey()) < sum) {
                    sum = entry.getValue() + l2.get(entry.getKey());
                    res[index] = entry.getKey();
                } else if (entry.getValue() + l2.get(entry.getKey()) == sum) {
                    res[++index] = entry.getKey();
                }
            }
        }
        return Arrays.copyOf(res, index+1);
    }
}