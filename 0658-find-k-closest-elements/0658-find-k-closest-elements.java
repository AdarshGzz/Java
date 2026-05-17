class Pair{
    int first;
    int second;
    Pair(int first,int second){
        this.first = first;
        this.second = second;
    }
}
class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int n = arr.length;
        List<Integer> ans = new ArrayList<>();
        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b)->{
            if(a.second ==b.second){
                return b.first-a.first;
            }
            return b.second-a.second;
        });

        for(int i=0;i<n;i++){
            int diff = Math.abs(arr[i]-x);
            pq.offer(new Pair(arr[i],diff));
            if(pq.size()>k) pq.poll();
        }

        for(int i=0;i<k;i++){
            ans.add(pq.poll().first);
        }

        Collections.sort(ans);
        return ans;
    }
}