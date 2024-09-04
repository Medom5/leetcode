class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int counter = 0;
        Set<Character> jwls = new HashSet<>();
        char arr1[] = jewels.toCharArray();
        char arr2[] = stones.toCharArray();
        
        for(int i=0; i<arr1.length; i++){
            jwls.add(arr1[i]);
        }
        
        for(int i=0; i<arr2.length; i++){
            if(jwls.contains(arr2[i])){
                counter++;
            }
        }
        
        return counter;
    }
}