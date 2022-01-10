class Solution {
    public String addBinary(String a, String b) {
        
        StringBuilder res = new StringBuilder();
        int i = a.length()-1;
        int j = b.length()-1;
        int car = 0;
        int sum = 0;
        while(i >= 0 || j >= 0)
        {
            sum = car;
            if(i >=0 ) sum += a.charAt(i)-'0';
            if(j >= 0) sum += b.charAt(j)-'0';
            
            res.append(sum%2);
            car = sum/2;
            i--;
            j--;
            
        }
        if(car > 0) res.append(car);
        return res.reverse().toString();
    }
}