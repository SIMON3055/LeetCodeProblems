class Solution {
    public boolean areNumbersAscending(String s) {
       String[] strs = s.split(" ");
        int prev = Integer.MIN_VALUE;
        for(String str : strs)
        {
            try
            {
            int cur = Integer.parseInt(str);
            if(cur > prev) {
                    prev = cur;
                } else {
                    return false;
                }
            }
            catch(Exception e){}
            
        }
        return true;
    }
}