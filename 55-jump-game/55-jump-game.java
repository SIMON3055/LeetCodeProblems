class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        int reachedSoFar = 0;
        for(int i = 0; i < n ; i++)
        {
            if(i > reachedSoFar) return false;
            reachedSoFar = Math.max(reachedSoFar,i + nums[i]);
        }
        return true;
    }
    
}