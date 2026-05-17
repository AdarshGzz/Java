class Pair{
    int first;
    int second;
    Pair(int first, int second){
        this.first = first;
        this.second = second;
    }
}
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n  = nums.length;
        int[] ans = new int[k];

        PriorityQueue<Pair> pq  = new PriorityQueue<>((a,b)-> a.second-b.second);
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            pq.offer(new Pair(entry.getKey(),entry.getValue()));
            if(pq.size()>k){
                pq.poll();
            }
        }

        for(int i=0;i<k;i++){
            ans[i] = pq.poll().first;
        }

        return ans;

    }
}