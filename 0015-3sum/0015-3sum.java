class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            int s = i+1;
            int e = n-1;
            while(s<e ){
                int sum = nums[i] + nums[s] + nums[e];
                if(sum==0){
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[s]);
                    temp.add(nums[e]);
                    ans.add(temp);

                    s++;
                    e--;
                    while(s < e && nums[s] == nums[s - 1]) s++;
                    while(s < e && nums[e] == nums[e + 1]) e--;
                }else if(sum<0){
                    s++;
                }else{
                    e--;
                }
            }
        }

        return ans;
    }
}