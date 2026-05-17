class Pair{
    int[] first;
    int second;
    Pair(int[] first, int second){
        this.first = first;
        this.second = second;
    }
}

class Solution {
    public int distance(int[]p){
        int x = p[0];
        int y = p[1];
        return x*x + y*y;
    }
    public int[][] kClosest(int[][] points, int k) {
        int n = points.length;
        int[][] ans = new int[k][2];
        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b)->b.second-a.second);

        for(int i=0;i<n;i++){
            int dist = distance(points[i]);
            pq.offer(new Pair(points[i],dist));
            if(pq.size()>k) pq.poll();
        }

        for(int i=0;i<k;i++){
            ans[i] = pq.poll().first;
        }
        return ans;
    }
}