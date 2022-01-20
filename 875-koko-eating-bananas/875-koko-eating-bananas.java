class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = 1;
        for(int i = 0; i < piles.length;i++)
            right = Math.max(right,piles[i]);
        
        while(left < right)
        {
            int mid = (left + right)/2;
            int sum = 0;
            for(int i = 0; i < piles.length;i++)
            {
                sum += Math.ceil((double)piles[i]/mid);
            }
            
            if(sum <= h){ right = mid;}
            else
            {
                left = mid+1;
        }
            
        }
        return right;
    }
}