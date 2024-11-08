class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int balance = 0, totalBalance = 0, start = 0;
        
        for(int i = 0; i < gas.length; i++){
            balance += (gas[i] - cost[i]);
            if(balance <=0){
                balance = 0;
                if(i!=gas.length-1)
                    start= i+1;
            }
            totalBalance += (gas[i] - cost[i]);
        }
    return totalBalance >=0  ? start : -1;
    }
    
}