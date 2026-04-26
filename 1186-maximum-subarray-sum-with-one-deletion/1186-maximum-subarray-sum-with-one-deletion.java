class Solution {
    public int maximumSum(int[] arr) {
        int n = arr.length;
        int oneDel = arr[0];
        int noDel = arr[0];
        int ans = arr[0];
        for(int i=1;i<n;i++){
            int curr = arr[i];
            oneDel = Math.max(oneDel+curr,noDel);
            noDel = Math.max(curr,noDel+curr);
            ans = Math.max(ans,Math.max(oneDel,noDel));
        }
        return ans;
    }
}