class Solution {
    public int longestOnes(int[] nums, int k) {
        int n = nums.length;
        int l = 0;
        int sum = 0;
        int ans = 0;

        for( int r = 0;r<n;r++){
            sum += nums[r];
            while(sum +k < r-l+1){
                sum -= nums[l];
                l++;
            }
            ans = Math.max(ans,r-l+1);
        }

        return ans;
    }
}