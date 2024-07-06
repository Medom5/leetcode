class Solution {
    public int romanToInt(String s) {
        int num = 0;
        int remainder = s.length();
        int i;
        HashMap<String, Integer> romans = new HashMap<>();

        romans.put("I", 1);
        romans.put("IV", 4);
        romans.put("V", 5);
        romans.put("IX", 9);
        romans.put("X", 10);
        romans.put("XL", 40);
        romans.put("L", 50);
        romans.put("XC", 90);
        romans.put("C", 100);
        romans.put("CD", 400);
        romans.put("D", 500);
        romans.put("CM", 900);
        romans.put("M", 1000);

        for (i = 0; i < s.length() - 1; i++) {
            String key = "" + s.charAt(i) + s.charAt(i + 1);

            if (key.equals("IV") || key.equals("IX") || key.equals("XL") || key.equals("XC")
                    || key.equals("CD") || key.equals("CM")) {
                num += romans.get(key);
                i++;
                remainder -= 2;
            } else {
                num += romans.get("" + s.charAt(i));
                remainder--;
            }
        }

        if (remainder == 1)
            num += romans.get("" + s.charAt(i));

        return num;

    }
}