class Solution {
    public int totalFruit(int[] f) {
        int n = f.length;
        int max = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        
        int left = 0;
        for(int right = 0;right<n;right++){
            int rightNum = f[right];
            map.put(rightNum,map.getOrDefault(rightNum,0)+1);

            while(map.size()>2){
                int leftNum  = f[left];
                map.put(leftNum,map.get(leftNum)-1);
                if(map.get(leftNum)==0){
                    map.remove(leftNum);
                }
                left++;
            }

            if(map.size()<=2){
                max = Math.max(max,right-left+1);
            }
        }

        return max;
    }
}