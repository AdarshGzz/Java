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
    int total = 0;
    int sum = 0;
    public void helper(TreeNode root){
        if(root==null) return;
        sum = sum*10+root.val;
        if(root.right==null && root.left==null){
            total+=sum;
        }
        helper(root.left);
        helper(root.right);
        
        sum/=10;
    }
    public int sumNumbers(TreeNode root) {
        helper(root);
        return total;
    }
}