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
    public TreeNode helper(TreeNode root, int[] depth){
        if(root==null){
            depth[0] = 0;
            return root;
        }

        int[] leftDepth = new int[1];
        int[] rightDepth = new int[1];

        TreeNode left = helper(root.left,leftDepth);
        TreeNode right = helper(root.right,rightDepth);

        if(leftDepth[0]>rightDepth[0]){
            depth[0] = leftDepth[0]+1;
            return left;
        }
        else if(rightDepth[0]>leftDepth[0]){
            depth[0] = rightDepth[0]+1;
            return right;
        }else{
            depth[0] = leftDepth[0]+1;
            return root;
        }

    }
    public TreeNode lcaDeepestLeaves(TreeNode root) {
        return helper(root,new int[1]);
    }
}