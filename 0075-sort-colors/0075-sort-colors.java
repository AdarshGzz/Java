class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        
        int s=0;
        int e=n-1;
        for(int i=s ;i<=e;i++){
            if(nums[i]==0){
                int temp = nums[i];
                nums[i] = nums[s];
                nums[s] = temp;
                s++;
            }else if(nums[i]==2){
                int temp = nums[i];
                nums[i] = nums[e];
                nums[e] = temp;
                e--;
                i--;
            }
        }
    }
}