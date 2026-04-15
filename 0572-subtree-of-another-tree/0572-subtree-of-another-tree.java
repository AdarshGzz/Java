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
    public boolean check(TreeNode l,TreeNode r){
        if(l==null && r==null) return true;
        if(l==null || r==null) return false;
        if(l.val!=r.val) return false;
        return check(l.left,r.left) && check(l.right,r.right);
    }
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root==null) return false;
        if(check(root,subRoot)){
            return true;
        }else{
            return isSubtree(root.left,subRoot) || isSubtree(root.right,subRoot);
        }
    }
}