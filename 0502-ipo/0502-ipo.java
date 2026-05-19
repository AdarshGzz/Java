class Pair{
    int capital;
    int profit;
    Pair(int capital,int profit){
        this.capital = capital;
        this.profit = profit;
    }
}
class Solution {
    // capital se km or equal jitne projects h unme se sbse jyada profit wala project uthaao
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        int n = profits.length;
        Pair[] arr = new Pair[n];
        for(int i=0;i<n;i++){
            arr[i] = new Pair(capital[i],profits[i]);
        }

        Arrays.sort(arr,(a,b)->a.capital-b.capital);

        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->b-a);

        int currCap = w;

        int projects = 0;

        int i = 0;

        while(projects<k){
            while(i<n && arr[i].capital<=currCap){
                pq.offer(arr[i].profit);
                i++;
            }
            if(pq.isEmpty()) break;

            currCap += pq.poll();

            projects++;
        }

        return currCap;
    }
}