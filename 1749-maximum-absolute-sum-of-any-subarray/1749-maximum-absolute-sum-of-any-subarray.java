class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int n = nums.length;
        int maxSum =nums[0];
        int minSum =nums[0];
        int min = nums[0];
        int max = nums[0];
        int ans = nums[0];
        
        for(int i=0;i<n;i++){
            int curr  = nums[i];
            maxSum = Math.max(curr,maxSum+curr);
            minSum = Math.min(curr,minSum+curr);
            max = Math.max(max,maxSum);
            min = Math.min(min,minSum);
            ans = Math.max(max,Math.abs(min));
        }
        return ans;
    }

}