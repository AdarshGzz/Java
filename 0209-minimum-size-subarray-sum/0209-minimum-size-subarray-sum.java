class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        if(target==0) return 0;
        int n = nums.length;
        int minLen = Integer.MAX_VALUE;
        int sum = 0;
        int left = 0;
        for(int right =0;right<n;right++){
            int r = nums[right];
            sum+=r;
            while(sum>=target){
                minLen = Math.min(minLen,right-left+1);
                int l = nums[left];
                sum-=l;
                left++;
            }
            
        }

        return minLen == Integer.MAX_VALUE? 0 : minLen;
    }
}