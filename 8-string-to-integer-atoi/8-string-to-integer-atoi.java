class Solution {
    public int myAtoi(String s) {
        s = s.trim();
        int r = 0;
        int i = 0;
        int sign = 1;
          if (s.isEmpty()) return 0;
        if(s.charAt(i)=='-') { sign = -1; i++; }
        else if(s.charAt(i)=='+'){i++;}
        
        while(i < s.length() && Character.isDigit(s.charAt(i)))
        {
            int d = s.charAt(i)-'0';
            if (r > (Integer.MAX_VALUE - d) / 10) return sign > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            r =r*10+d;
            System.out.print(r + " ");
            i++;
        }          
            
        
        return sign * r ;
    }
}