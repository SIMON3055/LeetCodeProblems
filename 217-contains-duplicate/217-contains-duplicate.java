class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> sb = new HashSet<Integer>();
        for(int i = 0; i < nums.length; i++) {
            if(sb.contains(nums[i])) return true;
            sb.add(nums[i]);
        }
        return false;
    }
}