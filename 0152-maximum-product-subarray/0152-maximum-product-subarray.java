class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int max = nums[0];
        int min = nums[0];
        int ans = nums[0];
        for(int i=1;i<n;i++){
            int a = nums[i];
            if(a<0){
                int temp = min;
                min = max;
                max = temp;
            }
            max = Math.max(max * a, a);
            min = Math.min(min * a, a);
            ans = Math.max(ans, max);
        }
        return  ans;
    }
}