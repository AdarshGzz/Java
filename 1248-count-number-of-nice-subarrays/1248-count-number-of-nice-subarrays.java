class Solution {
    public int atMostOdd(int[] nums,int k){
        int n = nums.length;
        int oddCount = 0;
        int count = 0;
        int left = 0;
        for(int right=0;right<n;right++){
            int r = nums[right];
            if(r%2!=0){
                oddCount++;
            }

            while(oddCount>k){
                int l = nums[left];
                if(l%2!=0){
                    oddCount--;
                }
                left++;
            }

            count += right-left+1;
        }

        return count;
    }

    public int numberOfSubarrays(int[] nums, int k) {
       return atMostOdd(nums,k)- atMostOdd(nums,k-1);
    }
}