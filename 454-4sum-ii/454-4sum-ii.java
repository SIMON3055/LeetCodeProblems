class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        
       
        int n = nums1.length;
        Map<Integer, Integer> map = new HashMap<>();
         for(int i = 0 ; i < n ; i++) {
            for(int j = 0; j < n; j ++) {
                int sum = nums1[i] + nums2[j];
                map.put(sum, map.getOrDefault(sum,0)+1);
            }
         }
        
        System.out.println(map);
        int result = 0;
         for(int i = 0 ; i < n ; i++) {
            for(int j = 0; j < n; j ++) {
                int sum = nums3[i] + nums4[j];
                if(map.containsKey(-1*sum)) 
                    result = result + map.get(-1*sum);
                
               // result += map.getOrDefault(-1 * (nums3[i]+nums4[j]), 0);
            }
         }
        
        return result;
        
        //Brute-Force Method 
        /*
        int n = nums1.length;
        int count = 0;
        for(int i = 0 ; i < n ; i++) {
            for(int j = 0; j < n; j ++) {
                for(int k = 0; k < n; k++) {
                    for( int l = 0; l < n; l++) {
                        
                        if(nums1[i] + nums2[j] + nums3[k] + nums4[l] == 0) {
                            count ++;
                        }
                    }
                }
            }
        }
        
        return count;
        */
        
    }
}