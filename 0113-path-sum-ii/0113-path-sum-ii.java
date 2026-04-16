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
    public void helper(List<List<Integer>> res,List<Integer> path ,TreeNode root, int targetSum){
        if(root==null) return;
        path.add(root.val);
        if((root.left==null && root.right==null) && targetSum==root.val ){
            res.add(new ArrayList<>(path));
        }else{
            helper(res,path,root.left,targetSum-root.val);
            helper(res,path,root.right,targetSum-root.val);
        }
        path.remove(path.size()-1);
    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> res = new ArrayList<>();
        
        helper(res,new ArrayList<>(),root,targetSum);

        return res;
    }
}