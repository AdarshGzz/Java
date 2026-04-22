class Solution {
    public int longestSubarray(int[] nums, int limit) {
        int n = nums.length;
        int maxLen = 0;

        Deque<Integer> maxD = new ArrayDeque<>();
        Deque<Integer> minD = new ArrayDeque<>();

        int left = 0;
        for(int right=0;right<n;right++){
            int r = nums[right];

            while(!maxD.isEmpty() && nums[maxD.peekLast()]<r){
                maxD.pollLast();
            }
            maxD.offerLast(right);

            while(!minD.isEmpty() && nums[minD.peekLast()]>r){
                minD.pollLast();
            }
            minD.offerLast(right);

            while(nums[maxD.peekFirst()] - nums[minD.peekFirst()] > limit){
                // int l = nums[left];
                if(maxD.peekFirst() == left) maxD.pollFirst();
                if(minD.peekFirst() == left) minD.pollFirst();
                left++;
            }

            maxLen = Math.max(maxLen,right-left+1);

        }
        return maxLen;
    }
} 