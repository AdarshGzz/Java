class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        int sum = 0;
        int count = 0;
        HashMap<Integer,Integer> prefix = new HashMap<>();
        for(int i=0;i<n;i++){
            sum += nums[i];
            if(sum==k) count++;
            
            int diff = sum - k;
            if(prefix.containsKey(diff)){
                count += prefix.get(diff);
            }

            prefix.put(sum, prefix.getOrDefault(sum,0)+1);
        }
        return count;
    }
}