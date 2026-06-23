class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }

        double ans = (double)sum/k;
        // for rest of the elements

        int l = k;
        int r = nums.length;
        while(l<r){
            int newNum = nums[l];
            sum = sum + newNum - nums[l-k];
            double newAvg = (double)sum/k;
            ans = Math.max(ans,newAvg);
            l++;
        }

        return ans;

    }
}