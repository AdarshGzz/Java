class Triplet{
    int row;
    int col;
    int val;
    Triplet(int row, int col, int val){
        this.row =row;
        this.col =col;
        this.val =val;
    }
}
class Solution {
    public int kthSmallest(int[][] mat, int k) {
        int n = mat.length;
        int m = mat[0].length;
        int count = 0;

        PriorityQueue<Triplet> pq = new PriorityQueue<>((a,b)-> a.val - b.val);
        for(int row = 0;row<n;row++){
            pq.offer(
                new Triplet(row,0,mat[row][0])
            );
        }

        while(!pq.isEmpty()){
            Triplet curr = pq.poll();
            count++;
            if(count==k)return curr.val;

            int row = curr.row;
            int col = curr.col;

            if(col+1<m){
                pq.offer(
                    new Triplet(row,col+1,mat[row][col+1])
                );
            }

        }

        return 0;
        
    }
}