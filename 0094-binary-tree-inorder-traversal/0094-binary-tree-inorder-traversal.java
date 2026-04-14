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
    // public void inorder(List<Integer>res, TreeNode curr){
    //     if(curr==null){
    //         return ;
    //     }
    //     inorder(res,curr.left);
    //     res.add(curr.val);
    //     inorder(res,curr.right);
    // }
    // public List<Integer> inorderTraversal(TreeNode root) {
    //     //recursion methode
    //     List<Integer> res = new ArrayList<>();
        
    //     inorder(res,root);
    //     return res;
    // }

//////////////


    public List<Integer> inorderTraversal(TreeNode root){
               // stack Methode
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> s = new Stack<>();
        TreeNode curr = root;
        while(curr!=null || !s.isEmpty()){
            // left
            while(curr!=null){
                s.push(curr);
                curr = curr.left;
            }
            // node
            curr = s.pop();
            res.add(curr.val);
            //right
            curr = curr.right;
        }

        return res;
    }
}