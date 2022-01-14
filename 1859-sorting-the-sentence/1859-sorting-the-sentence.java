class Solution {
    public String sortSentence(String s) {
        StringBuilder result = new StringBuilder();
        
        String[] strs = s.split(" ");
        String[] res = new String[strs.length];
        
        for(String str : strs)
        {
            int i = (int)(str.charAt(str.length()-1) - '0');
            res[i-1] = str.substring(0,str.length()-1);
        }
        
        for(String r : res)
        {
            result.append(r).append(" ");
            
        }
        
        return result.toString().trim();
    }
}