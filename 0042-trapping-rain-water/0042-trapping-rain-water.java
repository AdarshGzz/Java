class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int water = 0;
        int[] lmax = new int[n];
        lmax[0] = height[0];
        int[] rmax = new int[n];
        rmax[n-1] = height[n-1];

        for(int i=1;i<n;i++){
            lmax[i] = Math.max(height[i],lmax[i-1]);
        }

        for(int i=n-2;i>=0;i--){
            rmax[i] = Math.max(height[i],rmax[i+1]);
        }

        int l = 0;
        while(l<n){
            water += Math.min(lmax[l],rmax[l]) - height[l];
            l++;
        }

        return water;
    }
}