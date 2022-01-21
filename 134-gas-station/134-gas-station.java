class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        
        int n = gas.length;
        int start = 0;
        int tank = 0;
        int total = 0;
        for(int i = 0 ; i < n ; i++) {
            int fuel = gas[i]-cost[i];
            tank += fuel;
            total += fuel;
            if(tank < 0)
            {
                tank = 0;
                start = i+1;
            }
        }
        
        return total >= 0 ? start : -1;
            
    }
}