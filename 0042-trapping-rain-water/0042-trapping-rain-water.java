class Solution {
    public int trap(int[] height) {
        // int n = height.length;
        // int totalWater = 0 ;

        // for(int i=0;i<n;i++){
        //     int leftMax = 0;
        //     int rightMax = 0;

        //     for(int j =0;j<=i;j++){
        //         leftMax = Math.max(leftMax,height[j]);
        //     }

        //     for(int j=i;j<n;j++){
        //         rightMax = Math.max(rightMax,height[j]);
        //     }

        //     totalWater += Math.min(leftMax,rightMax) - height[i];
        // } 
        // return totalWater;
        // ______

        // int n = height.length;
        // int left = 0;
        // int right = n-1;

        // int leftMax = height[left], rightMax=height[right];
        // int water = 0;

        // while(left<right){
        //     if(leftMax<rightMax){
        //         left++;
        //         leftMax  = Math.max(leftMax,height[left]);
        //         water += leftMax - height[left];
        //     }else{
        //         right--;
        //         rightMax = Math.max(rightMax,height[right]);
        //         water += rightMax -height[right];
        //     }
        // }

        // return water;

        int n = height.length;
        int l = 0;
        int r = n-1;
        int lmax = 0;
        int rmax = 0;
        int water = 0;
        while(l<r){
            lmax = Math.max(lmax,height[l]);
            rmax = Math.max(rmax,height[r]);

            if(lmax<rmax){
                water += lmax - height[l];
                l++; 
            }else{
                water+= rmax - height[r];
                r--;
            }

        }

        return water;

    }
}