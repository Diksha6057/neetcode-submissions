class Solution {
    public int[] findDuplicates(int[] nums) {
        int[] count = new int[nums.length + 1];
        int[] temp = new int[nums.length];
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            count[nums[i]]++;
            if (count[nums[i]] == 2) {
                temp[k] = nums[i];
                k++;
            }}
        int[] ans = new int[k];
        for (int i = 0; i < k; i++) 
            ans[i] = temp[i];
        return ans;
    }}
