class Solution {
    public int getNextVaildCharIndex(String s, int i){
        int backspace = 0;
        while(i>=0){
            if(s.charAt(i)=='#'){
                backspace++;
            }else if(backspace>0){
                backspace--;
            }else{
                break;
            }
            i--;
        }
        return i;
    }
    public boolean backspaceCompare(String s, String t) {
        int i = s.length()-1;
        int j = t.length()-1;

        while(i>=0 || j>=0){
            i = getNextVaildCharIndex(s,i);
            j = getNextVaildCharIndex(t,j);

            if(i<0 && j<0) return true;
            if(i<0 || j<0) return false;
            if(s.charAt(i) != t.charAt(j)) return false;
            i--;
            j--;
        }
        return true;
    }
}