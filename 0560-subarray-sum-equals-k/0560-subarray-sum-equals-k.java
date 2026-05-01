class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        int sum = 0;
        int count = 0;
        HashMap<Integer,Integer> prefixSum  = new HashMap<>();
        for(int i=0;i<n;i++){
            sum += nums[i];
            if(sum ==k) count++;

            int diff = sum-k;
            if(prefixSum.containsKey(diff)){
                count += prefixSum.get(diff);
            }
            prefixSum.put(sum, prefixSum.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
}