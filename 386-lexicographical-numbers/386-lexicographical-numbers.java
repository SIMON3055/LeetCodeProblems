class Solution {
    List<Integer> res = new LinkedList<>();
    public List<Integer> lexicalOrder(int n) {
        
        
        for(int i = 1; i <= 9; i++)
         dfs(i,n);
        
    return res;
    }
    
    public void dfs(int i , int n){
        if(i> n) return;
        res.add(i);
        for(int j = 0; j < 10; j++)
         {
            dfs(10*i+j,n);
        }
    }  
}