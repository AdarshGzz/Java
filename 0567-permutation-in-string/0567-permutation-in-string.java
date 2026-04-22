class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int l1 = s1.length();
        int l2 = s2.length();
        if(l1>l2) return false;
        int[] s1F = new int[26];
        int[] s2F = new int[26];
        for(int i=0;i<l1;i++){
            s1F[ s1.charAt(i)-'a']++;
            s2F[ s2.charAt(i)-'a']++;
        }

        if(Arrays.equals(s1F,s2F)) return true;

        int l = 0;
        int r = l1;
        while(r<l2){
            char right = s2.charAt(r);
            char left = s2.charAt(l);
            s2F[right-'a']++;
            s2F[left -'a']--;
            if(Arrays.equals(s1F,s2F)) return true;
            l++;
            r++;
        }
        return false;

    }
}