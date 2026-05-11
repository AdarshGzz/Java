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
    public boolean flipEquiv(TreeNode r, TreeNode l) {
        if(r==null && l==null) return true;
        if(r==null || l==null) return false;
        if(r.val!=l.val) return false;

        if(flipEquiv(r.left,l.left) && flipEquiv(r.right,l.right)) return true;

        if(flipEquiv(r.left,l.right) && flipEquiv(r.right,l.left)) return true;

        return false;
    }
}