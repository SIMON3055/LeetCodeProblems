class Solution {
    public double findMaxAverage(int[] nums, int k) {   
         //method -1
        int n = nums.length;
        double ksum = 0;
        
        for(int i = 0 ; i < k ; i ++ ) {
            ksum += nums[i];
        }
        
         double result = ksum;
        for(int i = k ; i < n ; i++) {
            ksum = ksum -nums[i-k] + nums[i];
             result = Math.max(result, ksum);
        }
        return result/k;
        
        //method -1
//         double result = Float.MIN_VALUE ;
//         int n = nums.length;
//         double ksum = 0;
//         int j = 0;
        
//         for(int i = 0 ; i < k ; i ++ ) {
//             ksum += nums[i];
        
//         if(i >= k-1) {
            
           
//             if(ksum > result ) result = ksum;
//              System.out.println( i + "-" + "sum average" + result);
//             ksum = ksum - nums[j];
//             j++;
//         }
//       }
//     return result/k;
    }
}