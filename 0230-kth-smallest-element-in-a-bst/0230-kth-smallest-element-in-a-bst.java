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
    public void inorder(List<Integer> res,TreeNode root){
        if(root==null) return;
        inorder(res,root.left);
        res.add(root.val);
        inorder(res,root.right);

    }
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> res = new ArrayList();
        inorder(res,root);
        return res.get(k-1);
    }  
}