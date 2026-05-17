class Pair{
    int first;
    int second;
    Pair(int first,int second){
        this.first = first;
        this.second = second;
    }
}
class Solution {
    public int soldiers(int[] s){
        int ans = 0;
        for(int i=0;i<s.length;i++){
            if(s[i]==1) ans++;
        }
        // int i=0;
        // while(i<s.length && s[i]!=0){
        //     ans++;
        // }
        return ans;
    }
    public int[] kWeakestRows(int[][] mat, int k) {
        int n = mat.length;
        int[] ans = new int[k];
        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b)->{
            if(a.second==b.second){
                return b.first-a.first;
            }
            return b.second-a.second;
        });

        for(int row=0;row<n;row++){
            int soldier = soldiers(mat[row]);
            pq.offer(new Pair(row,soldier));
            if(pq.size()>k) pq.poll();
        }

        for(int i=k-1;i>=0;i--){
            ans[i] = pq.poll().first;
        }

        return ans;
    }
}