class Solution {
    public int maxProfit(int[] prices) {
        
        //Approach-1
        
        // int maxProfit = 0;
        // for(int i = 0; i < prices.length; i++)
        // {
        //     for(int j = i+1; j < prices.length; j++)
        //     {
        //         int res = prices[j] - prices[i];
        //         if(res > maxProfit)
        //             maxProfit = res; 
        //     }
        // }
        // return maxProfit;
        
        
    int maxPrice = Integer.MAX_VALUE;
    int result = 0;
    for (int i = 0; i < prices.length; i++) {
      //find the min price
      if (prices[i] < maxPrice) {
        maxPrice = prices[i];
      } else if (result < prices[i] - maxPrice) {
        //find the max price which after the min price
        result = prices[i] - maxPrice;
      }
    }
    return result;
        
        
    }
}