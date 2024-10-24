class Solution {
    public int hIndex(int[] citations) {
        int n = citations.length;
        int[] count = new int[n+1];
        
        for(int e: citations){
            if(e >= n)
                count[n]++;
            else
                count[e]++;
        }
        int s=0;
        for(int h=n; h>=0; h--){
            s+=count[h];
            if(s>=h)
                return h;
        }
        return 0;
    }
}