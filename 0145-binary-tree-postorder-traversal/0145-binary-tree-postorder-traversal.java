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
    // public void postorder(List<Integer> res, TreeNode curr){
    //     if(curr==null){
    //         return;
    //     }
    //     postorder(res,curr.left);
    //     postorder(res, curr.right);
    //     res.add(curr.val);
    // }
    // public List<Integer> postorderTraversal(TreeNode root) {
    //     List<Integer> res = new ArrayList<>();
    //     postorder(res,root);
    //     return res;
    // }


    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if(root==null){
            return res;
        }

        Stack<TreeNode> s = new Stack<>();
        s.push(root);
        while(!s.isEmpty()){
            TreeNode curr = s.pop();

            res.add(curr.val);

            if(curr.left!=null){
                s.push(curr.left);
            }
            if(curr.right!=null){
                s.push(curr.right);
            }
        }
        Collections.reverse(res);
        return res;
    }
}