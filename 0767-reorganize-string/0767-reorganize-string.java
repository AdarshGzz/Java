class Pair{
    char first;
    int second;
    Pair(char first, int second){
        this.first = first;
        this.second = second;
    }
}
class Solution {
    public String reorganizeString(String s) {
        int n = s.length();
        int seat = 0;
        String ans = "";
        HashMap<Character,Integer> map = new HashMap<>();
        for(char i:s.toCharArray()){
            map.put(i,map.getOrDefault(i,0)+1);
        }

        PriorityQueue<Pair> pq= new PriorityQueue<>((a,b)->b.second-a.second);

        for(Map.Entry<Character,Integer> e:map.entrySet()){
            pq.offer(
                new Pair(e.getKey(),e.getValue())
            );
        }

        Pair prev = null;

        while(!pq.isEmpty()){
            Pair curr = pq.poll();
            ans += curr.first;
            curr.second--;

            if(prev!=null && prev.second>0){
                pq.offer(prev);
            }

            prev = curr;
        }

        if(ans.length()!=n) return "";

        return ans;

    }
}