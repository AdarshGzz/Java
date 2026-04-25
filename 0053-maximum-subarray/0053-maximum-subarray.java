class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int right=0;right<n;right++){
            int r = nums[right];
            sum = Math.max(r,sum+r);
            maxSum = Math.max(maxSum,sum);
        }

        return maxSum==Integer.MIN_VALUE?0:maxSum;

    }
}