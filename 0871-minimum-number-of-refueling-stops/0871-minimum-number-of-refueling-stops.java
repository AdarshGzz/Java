
class Solution {
    // saare reachable stations ko maxHeap me daal do fir jisme sbse jyada fuel h wha se lo
    public int minRefuelStops(int target, int startFuel, int[][] stations) {
        int n = stations.length;
        int stops = 0;
        int fuel = startFuel;
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);

        int i = 0;
        while (fuel < target) {
            while (i < n && stations[i][0] <= fuel) {
                pq.offer(stations[i][1]);
                i++;
            }

            if (pq.isEmpty())
                return -1;

            fuel += pq.poll();
            stops++;
        }

        return stops;

    }
}