class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;
        int ans = 0;
        int curr = 0;
        int l = 0;
        while(l<n){
            if(nums[l]==1){
                curr++;
                ans = Math.max(curr,ans);
            }else{
                curr = 0;
            }
            l++;
        }
        return ans;
    }
}