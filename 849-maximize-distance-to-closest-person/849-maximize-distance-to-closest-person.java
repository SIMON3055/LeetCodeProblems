class Solution {
    public int maxDistToClosest(int[] nums) {
        
        // int max = 0;
        // int count = 0;
        // for(int i = 0; i < seats.length; i++) {
        //     count = 0;
        //     while(i < seats.length && seats[i] == 0) {
        //         {
        //             count++;
        //             i++;
        //         }
        //         if(count > max)
        //             max = count;
        //     }
        // }
        // System.out.println(max);
        // return (max+1)/2;
        
        int n = nums.length;
        int max = 0;
        int i = 0;
        while(i < n){
            while(i < n && nums[i] == 1){
                i++;
            }
            int j = i;//start
            while(i < n && nums[i] == 0){
                i++;
            }
            if(j == 0 || i == n){
                max = Math.max(max, i - j);
            }else{
                max = Math.max(max, (i - j + 1) / 2) ;
            }
        }
        return max;
    }
}