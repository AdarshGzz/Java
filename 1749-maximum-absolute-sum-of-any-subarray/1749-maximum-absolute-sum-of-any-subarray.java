class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int n = nums.length;
        int sumi = nums[0];
        int sumx = nums[0];
        int max = nums[0];
        int min = nums[0];
       
        for(int i=1;i<n;i++){
            int r = nums[i];
            sumi = Math.min(r,sumi+r);
            sumx = Math.max(r,sumx+r);
            max = Math.max(sumx,max);
            min = Math.min(sumi,min);
        }

        return Math.max(max , Math.abs(min));
        
    }
}