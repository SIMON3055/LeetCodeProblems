class Solution {
    public boolean validMountainArray(int[] A) {
        // int n = A.length, i = 0, j = n - 1;
        // while (i + 1 < n && A[i] < A[i + 1]) i++;
        // while (j > 0 && A[j - 1] > A[j]) j--;
        // return i > 0 && i == j && j < n - 1;
        
        if (A.length < 3) return false;
      int start = 0;
      int end = A.length-1;
      while (start < end) {
        if (A[start+1] > A[start]) {
          start++;
        } else if (A[end-1] > A[end]) { 
          end--;
        } else {
          break;
        }
      }
      return start != 0 && end != A.length-1 && start == end;
    }
}