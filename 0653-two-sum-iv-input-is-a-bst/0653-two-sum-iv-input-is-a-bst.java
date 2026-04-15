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
    public boolean dfs(HashSet<Integer> h,TreeNode root, int k){
        if(root==null) return false;
        if(h.contains(k-root.val)) return true;
        h.add(root.val);
        return dfs(h,root.left,k) || dfs(h,root.right,k);
    }
    public boolean findTarget(TreeNode root, int k) {
        HashSet<Integer> h = new HashSet<>();
        return dfs(h,root,k);
    }
}