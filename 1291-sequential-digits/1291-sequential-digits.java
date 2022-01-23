class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
     
        List<Integer> result = new LinkedList<Integer>();
        int[] allList = {12,23,34,45,56,67,78,89,
                         123,234,345,456,567,678,789,
                         1234,2345,3456,4567,5678,6789,
                         12345,23456,34567,45678,56789,
                         123456,234567,345678,456789,
                         1234567,2345678,3456789,
                         12345678,23456789,
                         123456789};
        
        int n = allList.length;
        for(int i = 0; i < n ; i++) {
            if(allList[i] < low) continue;
            if(allList[i] > high) break;
            result.add(allList[i]);
        }
        
        return result;
        
        
        
        
        
        
//         //Brute force
//         List<Integer> result = new LinkedList<Integer>();
//         if (low == high) return result;
        
//         for(int i = low; i <=high ; i++)
//         {
//             if(checkSequential(i))
//             {
//                 result.add(i);
//             }
//         }
        
//         return result;
//     }
    
//     public boolean checkSequential(int n) {
        
//         int prev = n%10;
//         n = n/10;
//         while(n > 0)
//         {    
//             int temp = n % 10;
            
//             if(temp == prev - 1)
//             {
//                 n = n/10; 
//                 prev = temp;
//             }
//             else
//             {
//                 return false;
//             }
//         }
        
//         return true;
        
    }
}