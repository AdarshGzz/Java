class Pair{
    char first;
    int second;
    Pair(char first,int second){
        this.first = first;
        this.second = second;
    }
}
class Solution {
    public int leastInterval(char[] tasks, int n) {
        int t = tasks.length;
        int time = 0;
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<t;i++){
            map.put(tasks[i],map.getOrDefault(tasks[i],0)+1);
        }

        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b)->{
            return b.second-a.second;
        });

        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            pq.offer(
                new Pair(entry.getKey(),entry.getValue())
            );
        }

        while(!pq.isEmpty()){
            List<Pair> temp =new ArrayList<>();
            int interval = n+1;
            while(interval>0 && !pq.isEmpty()){
                Pair curr = pq.poll();
                time++;
                // temp.add(curr.first);
                if(curr.second-1>0){
                    temp.add(
                        new Pair(curr.first,curr.second-1)
                    );
                }
                interval--;
            }
            for(int i=0;i<temp.size();i++){
                pq.offer(temp.get(i));
            }

            if(!pq.isEmpty()){
                time+=interval;
            }
        }

        return time;
    }
}