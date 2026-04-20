class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int[] sortedNums = Arrays.copyOf(nums,nums.length);
        Arrays.sort(sortedNums);
        int start = nums.length;
        int end = 0;
        for(int i=0;i<nums.length;i++){
            if(sortedNums[i]!=nums[i]){
                start = Math.min(start,i);
                end = Math.max(end,i);
            }
        }

        return end-start>=0 ? end-start+1 : 0;

    }
}