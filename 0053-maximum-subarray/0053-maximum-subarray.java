class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int max = nums[0];
        int ans = nums[0];
        for(int i=1;i<n;i++){
            max = Math.max(nums[i]+max, nums[i]);
            ans = Math.max(ans,max);
        }
        return ans;
    }
}