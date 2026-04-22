class Solution {
    public String minWindow(String s, String t) {
        int m = s.length();
        int n = t.length();
        if(n>m) return "";
        int minLen = Integer.MAX_VALUE;
        int start = 0;
   
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(t.charAt(i), map.getOrDefault(t.charAt(i),0) +1 );
        }
        int count = map.size();

        int left = 0;
        for(int right=0;right<m;right++){
            char r = s.charAt(right);
            if(map.containsKey(r)){
                map.put(r, map.get(r) - 1);
                if(map.get(r) == 0){
                    count--;
                }
            }
            while(count==0){
                if(right-left+1<minLen){
                    minLen = right-left+1;
                    start = left;
                }
                char l = s.charAt(left);
                if(map.containsKey(l)){
                    map.put(l,map.get(l)+1);
                    if(map.get(l)>0){
                        count++;
                    }
                }  
                left++;
            }
        }

        return minLen==Integer.MAX_VALUE? "" : s.substring(start,start+minLen); 

    }
}