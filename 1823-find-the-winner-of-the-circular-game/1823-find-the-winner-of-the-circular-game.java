class Solution {
    public int findTheWinner(int n, int k) {
        // if(n==1) return 0;
        // int x = findTheWinner(n-1,k);
        // int y = (x + k)%n;
        // return y;
        
        
        return (n == 1) ? 1 : (findTheWinner(n - 1, k) + k - 1) % n + 1;
    }
}