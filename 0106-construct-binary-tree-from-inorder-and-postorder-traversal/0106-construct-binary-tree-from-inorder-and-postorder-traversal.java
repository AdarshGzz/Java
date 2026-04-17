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
    public TreeNode helper(int[] post,int l,int r){
        if(l>r) return null;

        TreeNode root = new TreeNode(post[idx]);
        int mid = map.get(root.val);
        idx--;

        root.right = helper(post,mid+1,r);
        root.left = helper(post,l,mid-1);
        return root;
    }
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        idx = postorder.length-1;
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        return helper(postorder,0,inorder.length-1);
    }
}