class Solution {
    public int maximumSum(int[] arr) {
        int n= arr.length;
        int noDel = arr[0];
        int oneDel = arr[0];
        int ans = arr[0];
        for(int i=1;i<n;i++){
            oneDel = Math.max(oneDel+arr[i],noDel);
            noDel = Math.max(arr[i], noDel+arr[i]);
            ans = Math.max(ans, Math.max(noDel,oneDel));
        }
        return ans;
    }
}