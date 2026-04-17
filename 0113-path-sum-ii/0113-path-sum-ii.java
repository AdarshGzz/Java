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
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> temp = new ArrayList<>();
    public void helper(TreeNode root, int targetSum){
        if(root==null) return;
        temp.add(root.val);
        if(root.left==null && root.right==null && targetSum==root.val){
            res.add(new ArrayList<>(temp));
        }
        helper(root.left,targetSum-root.val);
        helper(root.right,targetSum-root.val);
        temp.remove(temp.size()-1);
    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        helper(root,targetSum);
        return res;
    }
}