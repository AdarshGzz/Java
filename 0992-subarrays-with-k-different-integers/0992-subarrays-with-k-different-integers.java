class Solution {
    public int atMost(int[]nums, int k){
        int n = nums.length;
        if(n<k) return 0;
        int count = 0;
        HashMap<Integer,Integer> map = new HashMap<>();

        int left = 0;
        for(int right = 0;right<n;right++){
            int r = nums[right];
            map.put(r,map.getOrDefault(r,0) +1);

            while(map.size()>k){
                int l = nums[left];
                map.put(l ,map.get(l)-1);
                if(map.get(l)==0){
                    map.remove(l);
                }
                left++;
            }

            count += right-left+1;
        }

        return count;
    }
    public int subarraysWithKDistinct(int[] nums, int k) {
        return atMost(nums,k) - atMost(nums,k-1);
    }
}