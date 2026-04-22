class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();
        int max = 0;
        int maxFreq = 0;
        HashMap<Character,Integer> map = new HashMap<>();

        int left = 0;
        for(int right=0;right<n;right++){
            char r = s.charAt(right);
            map.put(r, map.getOrDefault(r,0) +1);

            maxFreq = Math.max(maxFreq,map.get(r));

            while((right-left+1) - maxFreq > k){
                char l = s.charAt(left);
                map.put(l,map.get(l)-1);
                if(map.get(l)==0) map.remove(l);
                left++;
            }
            
            max = Math.max(max,right-left+1);
        }

        return max;
    }
}