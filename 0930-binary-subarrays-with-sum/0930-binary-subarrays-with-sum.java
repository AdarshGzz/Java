class Solution {
    public int atMostSum(int[] nums, int goal){
        if(goal<0) return 0;
        int n= nums.length;
        int sum = 0;
        int count = 0;
        int left = 0;
        for(int right=0;right<n;right++){
            int r = nums[right];
            sum+=r;
            while(sum>goal){
                int l = nums[left];
                sum-=l;
                left++;
            }

            count += right-left+1;
        }
        return count;
    }
    public int numSubarraysWithSum(int[] nums, int goal) {
      return atMostSum(nums,goal) - atMostSum(nums,goal-1);
    }
}