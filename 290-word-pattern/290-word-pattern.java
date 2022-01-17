class Solution {
    public boolean wordPattern(String pattern, String s) {
        
        String[] snarray = s.split(" ");
        HashMap<Character,String> map = new HashMap<>();
        if(pattern.length()!=snarray.length) return false;
    
         for(int i = 0; i < pattern.length(); i++)
         {
             char c = pattern.charAt(i);
             if(map.containsKey(c))
             {
                 if(!map.get(c).equals(snarray[i]))
                     return false;
                  
             } 
             else{
                 
                 if(map.containsValue(snarray[i]))
                     return false;
                 else
                     map.put(c, snarray[i]);
             }
         }
        
        return true;
    }
}