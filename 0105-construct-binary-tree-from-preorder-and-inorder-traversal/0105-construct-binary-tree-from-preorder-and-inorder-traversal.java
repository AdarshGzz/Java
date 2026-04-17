/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    HashMap<Integer,Integer> map = new HashMap<>();
    int idx = 0;
    public TreeNode helper(int[] pre,int l,int r){
        if(l>r) return null;
        TreeNode root = new TreeNode(pre[idx]);
        int mid = map.get(pre[idx]);
        idx++;
        root.left = helper(pre,l,mid-1);
        root.right = helper(pre,mid+1,r);
        return root;
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        return helper( preorder,0,inorder.length-1);
    }
}