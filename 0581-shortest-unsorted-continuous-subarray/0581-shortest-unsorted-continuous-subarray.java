class Solution {
    public int findUnsortedSubarray(int[] nums) {
        // int[] sortedNums = Arrays.copyOf(nums,nums.length);
        // Arrays.sort(sortedNums);
        // int start = nums.length;
        // int end = 0;
        // for(int i=0;i<nums.length;i++){
        //     if(sortedNums[i]!=nums[i]){
        //         start = Math.min(start,i);
        //         end = Math.max(end,i);
        //     }
        // }

        // return end-start>=0 ? end-start+1 : 0;

        int maxseen = Integer.MIN_VALUE;
        int minseen = Integer.MAX_VALUE;

        int start = -1;
        int end = -2;

        // Left → Right
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < maxseen) {
                end = i;
            } else {
                maxseen = nums[i];
            }
        }

        // Right → Left
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] > minseen) {
                start = i;
            } else {
                minseen = nums[i];
            }
        }

        return end - start + 1;

    }
}