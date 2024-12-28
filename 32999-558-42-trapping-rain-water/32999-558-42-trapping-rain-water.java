class Solution {
    public int trap(int[] height) {
        if(height.length <= 2)
            return 0;
        
        int left=0, right = height.length-1;
        int rMax=0, lMax=0, res=0;
        
        while(left<right){
            if(height[left] < height[right]){
                if(height[left] < lMax)
                    res += lMax-height[left];
                else
                    lMax = height[left];
                left++;
            }
            else {
                if(height[right] < rMax)
                    res += rMax-height[right];
                else
                rMax = height[right];
            right--;
            }
        }

    return res;
    }
}