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

    //recursion methode
    // public void preorder(List<Integer>res , TreeNode curr){
    //     if(curr==null){
    //         return;
    //     }
    //     res.add(curr.val);
    //     preorder(res,curr.left);
    //     preorder(res,curr.right);
    // }

    // public List<Integer> preorderTraversal(TreeNode root) {
    //     List<Integer> res = new ArrayList<>();
    //     preorder(res, root);
    //     return res;
    // }

    //stack methode
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if(root==null){
            return res;
        }
        Stack<TreeNode> s= new Stack<>();
        s.push(root);

        while(!s.isEmpty()){
            // node
            TreeNode curr = s.pop();
            res.add(curr.val);

            
            // right 
            if(curr.right!=null){
                s.push(curr.right);
            }

            // left 
            if(curr.left!=null){
                s.push(curr.left);
            }

        }

        return res;
    }
}