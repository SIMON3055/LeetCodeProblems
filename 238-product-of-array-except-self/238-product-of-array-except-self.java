class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product = 1, cnt = 0;
        for (int i = 0; i < nums.length; ++i){
            if (nums[i] == 0){ 
                ++cnt;
                continue;
            }
            
            product *= nums[i];
        }
        for (int i = 0; i < nums.length; ++i){
            if (nums[i] == 0){
               nums[i] = (cnt == 1) ? product : 0;  
            }
            else {
                nums[i] = (cnt > 0) ? 0 :  product / nums[i];
            }
        }
        return nums;
        
    }
}